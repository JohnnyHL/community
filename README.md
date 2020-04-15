# 网站说明
甲壳虫社区（Beetle Community）是一个开源的问答社区、论坛、博客，您可以提出自己的问题、发布自己的文章、和其他用户交流。

目前功能有第三方登陆、邮箱注册登录、查看、发布、评论、消息通知、顶置、搜索、热门问题和标签... ...

后续会不断的更新完善，欢迎大家提供更好的建议

线上地址：[http://www.dbeetle.cn/](http://www.dbeetle.cn/)

# 使用技术
### 后端：
- Spring Boot
- Mybatis
- Thymeleaf

### 前端：
- JavaScript
- Jquery
- BootStrap

### 数据库：
- MySQL
- Redis

# 开发环境
- JDK 1.8.0_131
- Maven 3.52
- MySQL 5.6.46
- Git 2.24.0
- IntelliJ IDEA 2019.3.3
- Redis 5.0.8

# 快速部署
1. clone 本项目到本地：`git clone git@github.com:songjilong/community.git`，并导入到自己的 ide
2. 在本地创建数据库，命名为 db_community，字符集设置为 utf8mb4
3. 打开 pom.xml、application.yml、application.properties，修改数据库连接信息
4. 执行命令：`mvn flyway:migrate -P dev` 创建数据库表
5. 点击运行即可
6. 如果想要使用邮件注册功能，需要安装redis，修改配置文件里的连接信息
7. 如果想要使用第三方登录功能（GitHub、Gitee、QQ），需要自行注册第三方应用，官网上有开发文档
----
其他：
- Mybatis Generator代码生成命令：`mvn -Dmybatis.generator.overwrite=true mybatis-generator:generate -P dev`

# 更新日志

2020.4.15 
- 添加聊天室
- 添加音乐播放器
- 修复邮件发送不提示问题

2020.4.11
- 将每日一图换为每日一文

# 第三方工具
- [Lombok](https://projectlombok.org/)  
- [Flyway](https://flywaydb.org/)  
- [postman（浏览器插件版） 可以共享浏览器session](https://chrome.google.com/webstore/detail/tabbed-postman-rest-clien/coohjcphdfgbiolnekdpbcijmhambjff)  
- [moment：JavaScript日期处理类库](http://momentjs.cn/)  
- [markdown编辑器](https://pandao.github.io/editor.md/)  
- [前端校验](https://validator.niceue.com/)  
- [聊天室DaoVoice](http://dashboard.daovoice.io/)  

# 参考文档
- [Spring Boot官方文档](https://docs.spring.io/spring-boot/docs/2.2.4.RELEASE/reference/html/)  
- [BootStrap官方教程](https://v3.bootcss.com/components/)  
- [Github第三方登录官方教程](https://developer.github.com/apps/)  
- [Mybatis官方文档](https://mybatis.org/mybatis-3/zh/index.html)  
- [Thymeleaf官方文档](https://www.thymeleaf.org/doc/tutorials/3.0/usingthymeleaf.html)  
- [Mybatis Generator官方文档](http://mybatis.org/generator/)   
- [MySQL菜鸟教程](https://www.runoob.com/mysql/mysql-tutorial.html)  
- [Lombok官网](https://projectlombok.org/)   
- [阿里云OSS使用教程](https://help.aliyun.com/document_detail/31883.html?spm=5176.8466010.bucket.4.7c451450a0B80C)  
- [Spring Boot 日志配置](https://blog.csdn.net/Inke88/article/details/75007649)  

# 常见问题解决
- [Github登录流程分析](https://www.cnblogs.com/songjilong/p/12309552.html)  
- [Github更新官方推荐的使用access_token安全访问API的方式](https://blog.csdn.net/kuaileky/article/details/104217757)  
- [Mybatis Generator配置文件内容详解](https://www.jianshu.com/p/a8bfc14a3534)     
- [Springboot mybatis集成 Invalid bound statement (not found)](https://blog.csdn.net/qq_35981283/article/details/78590090)    
- [MyBatis Generator实现MySQL分页插件](https://blog.csdn.net/xiao__gui/article/details/51333693)    
- [Thymeleaf th:include、th:replace使用](https://blog.csdn.net/believe__sss/article/details/79992408)
- [git push报错连接超时443](https://gist.github.com/laispace/666dd7b27e9116faece6)    
- [thymeleaf向fragment中传入具体值](https://blog.csdn.net/u010999809/article/details/80724076)
- [阿里云OSS上传Object后如何获取访问URL？](https://www.alibabacloud.com/help/zh/doc-detail/39607.htm)
- [CentOs防火墙设置](https://support.huaweicloud.com/trouble-ecs/ecs_trouble_0402.html)
- [git同步代码至github和gitee(码云)](https://zhuanlan.zhihu.com/p/71163868)

