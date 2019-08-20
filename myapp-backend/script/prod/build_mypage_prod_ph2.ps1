cd .\mypage\mypage\
git fetch
git checkout release/prod_ph2
git pull

npm install
npm run build

cd ..\..\backend-api-mypage\myapp-backend
git fetch
git checkout .
git checkout release/prod_ph2
git pull

Remove-Item -path .\src\main\webapp\static\ -recurse -force
Remove-Item -path .\src\main\webapp\WEB-INF\views\welcome\start.jsp -recurse -force
Copy-Item ..\..\mypage\mypage\dist\index.html .\src\main\webapp\WEB-INF\views\welcome\start.jsp -Recurse
Copy-Item ..\..\mypage\mypage\dist\static .\src\main\webapp -Recurse

mvn clean
mvn -P PROD,PROD_MYPAGE package

Copy-Item .\target\myapp-backend.war  ..\..\mypage.war.prod -Recurse
