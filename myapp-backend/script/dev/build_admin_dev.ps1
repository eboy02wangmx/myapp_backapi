
cd .\admin-mock\myapp-frontend\
git fetch
git checkout release/dev
git pull

npm install
npm run build_dev

cd ..\..\backend-api-admin\myapp-backend
git fetch
git checkout .
git checkout release/dev
git pull

Remove-Item -path .\src\main\webapp\assets\ -recurse -force
Remove-Item -path .\src\main\webapp\static\ -recurse -force
Remove-Item -path .\src\main\webapp\WEB-INF\views\welcome\start.jsp  -recurse -force
Copy-Item ..\..\admin-mock\myapp-frontend\dist\index.html .\src\main\webapp\WEB-INF\views\welcome\start.jsp -Recurse
Copy-Item ..\..\admin-mock\myapp-frontend\dist\assets .\src\main\webapp -Recurse
Copy-Item ..\..\admin-mock\myapp-frontend\dist\static .\src\main\webapp -Recurse

mvn clean
mvn -P DEV,DEV_ADMIN package

Copy-Item .\target\myapp-backend.war  ..\..\admin.war.dev -Recurse
