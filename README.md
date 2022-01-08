注意:
部署到tomcat的时候,只需要在/bin/catalina.sh 
添加 JAVA_OPTS="-Denv=dev -Dapollo.cacheDir=/opt/data/apollo1 -D=DEFAULT"
说明
//-Denv -> 标记环境
//-Dapollo.cacheDir -> 临时配置文件保存位置
//-Dapollo.cluster -> 对应集群,默认就是default