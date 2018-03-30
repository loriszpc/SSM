# SSM
项目描述：
写一个邮件发送的工程
使用技术：
    springmvc,spring,mybatis,数据库为centos7.x下的MariaDB.
已实现功能：
1，通过AOP拦截实现代码级别的读写分离
2，定时任务的开启
3，代码自动生成。mybatis逆向工程，自动生成mapper和dao接口，以及在service中通过使用example对象进行简易查询

未完待续。。。
未来第一阶段目标：
1，redis集群作缓存
2，集成activeMq(或者rocketMq)
3，线程池（多线程进行用户的筛查并做邮件投送）
4，freemarker(或thymeleaf)模板的使用

第二阶段目标：
1，项目结构改进，使用zookeeper对web层和service层分离
2，tomcat集群，redis集群，nginx四层负载均衡实现

PS:
以上所列条目随时更改，所有代码，所有配置（服务器部署，nginx配置，tomcat配置，HAProxy+keepAlived配置）都会贴上来，欢迎大家关注！
