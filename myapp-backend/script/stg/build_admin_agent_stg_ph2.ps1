
cd .\admin-mock\myapp-frontend\
git fetch
git checkout release/stage_ph2
git pull

npm install
npm run build_stage_agent

cd ..\..\backend-api-agent\myapp-backend
git fetch
git checkout .
git checkout release/stage_ph2
git pull

Remove-Item -path .\src\main\webapp\assets\ -recurse -force
Remove-Item -path .\src\main\webapp\static\ -recurse -force
Remove-Item -path .\src\main\webapp\WEB-INF\views\welcome\start.jsp  -recurse -force
Copy-Item ..\..\admin-mock\myapp-frontend\dist\index.html .\src\main\webapp\WEB-INF\views\welcome\start.jsp -Recurse
Copy-Item ..\..\admin-mock\myapp-frontend\dist\assets .\src\main\webapp -Recurse
Copy-Item ..\..\admin-mock\myapp-frontend\dist\static .\src\main\webapp -Recurse

mvn clean
mvn -P "STG,STG_AGENT" package

Copy-Item .\target\myapp-backend.war  ..\..\admin.war.agent.stg -Recurse
