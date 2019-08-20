## Build

※Front側をBuildして

リリース用（管理画面（社内ユーザ）DEV環境）
``` bash
mvn clean
mvn -P DEV,DEV_ADMIN package
```

リリース用（管理画面（代理店ユーザ）DEV環境）
``` bash
mvn clean
mvn -P DEV,DEV_AGENT package
```

リリース用（HA　DEV環境）
``` bash
mvn clean
mvn -P DEV,DEV_HA package
```

リリース用（Mypage　DEV環境）
``` bash
mvn clean
mvn -P DEV,DEV_MYPAGE package
```

リリース用（管理画面（社内ユーザ）STG環境）
``` bash
mvn clean
mvn -P STG,STG_ADMIN package
```

リリース用（管理画面（代理店ユーザ）STG環境）
``` bash
mvn clean
mvn -P STG,STG_AGENT package
```

リリース用（HA　STG環境）
``` bash
mvn clean
mvn -P STG,STG_HA package
```

リリース用（Mypage　STG環境）
``` bash
mvn clean
mvn -P STG,STG_MYPAGE package
```

リリース用（管理画面（社内ユーザ）PROD環境）
``` bash
mvn clean
mvn -P PROD,PROD_ADMIN package
```

リリース用（管理画面（代理店ユーザ）PROD環境）
``` bash
mvn clean
mvn -P PROD,PROD_AGENT package
```

リリース用（HA　PROD環境）
``` bash
mvn clean
mvn -P PROD,PROD_HA package
```

リリース用（Mypage　PROD環境）
``` bash
mvn clean
mvn -P PROD,PROD_MYPAGE package
```
