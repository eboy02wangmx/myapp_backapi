cd .\homeassist\fireinsurance\
git fetch
git checkout release/dev
git pull

npm install
npm run build_dev

cd ..\..\backend-api-homeassist\myapp-backend
git fetch
git checkout .
git checkout release/dev
git pull

Remove-Item -path .\src\main\webapp\static\ -recurse -force
Remove-Item -path .\src\main\webapp\WEB-INF\views\welcome\start.jsp -recurse -force
Remove-Item -path .\src\main\resources\EarthquakeSubscriber -recurse -force
Copy-Item ..\..\homeassist\fireinsurance\dist\index.html .\src\main\webapp\WEB-INF\views\welcome\start.jsp -Recurse
Copy-Item ..\..\homeassist\fireinsurance\dist\static .\src\main\webapp -Recurse
Move-Item -path .\src\main\webapp\static\json -destination .\src\main\resources\EarthquakeSubscriber

mvn clean
mvn -P DEV,DEV_HA package

Copy-Item .\target\myapp-backend.war  ..\..\homeassist.war.dev -Recurse
