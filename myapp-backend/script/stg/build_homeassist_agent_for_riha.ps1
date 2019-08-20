cd .\homeassist-release\fireinsurance\
git fetch
git checkout release/prod_ph2
git pull

npm install
npm install --save qrcode
npm run build_stage_agent

cd ..\..\backend-api-release\myapp-backend
git fetch
git checkout .
git checkout release/prod_ph2
git pull

Remove-Item -path .\src\main\webapp\static\ -recurse -force
Remove-Item -path .\src\main\webapp\WEB-INF\views\welcome\start.jsp -recurse -force
Remove-Item -path .\src\main\resources\EarthquakeSubscriber -recurse -force
Copy-Item ..\..\homeassist\fireinsurance\dist\index.html .\src\main\webapp\WEB-INF\views\welcome\start.jsp -Recurse
Copy-Item ..\..\homeassist\fireinsurance\dist\static .\src\main\webapp -Recurse
Move-Item -path .\src\main\webapp\static\json -destination .\src\main\resources\EarthquakeSubscriber

mvn clean
mvn -P "STG,STG_HA_PH2" package

Copy-Item .\target\myapp-backend.war  ..\..\homeassist.war.stg -Recurse
pause

