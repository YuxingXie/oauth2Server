# spring-security-auth实现auth 2.0认证
  
文章出处
https://www.yiibai.com/spring-security/secure-spring-rest-api-using-oauth2.html

先依样画葫芦按照教程搭建。

一个困扰了几个星期的问题，从作者文章出处下载的源代码可以作为tomcat server app运行，我将该项目改为springboot+gradle以后，便出现
No ServletContext set错误。经过大量google，无人给出答案，可能的原因是spring bean的加载顺序问题，
所以我将作者定义的两个类OAuth2SecurityConfiguration和AuthorizationServerConfiguration改为静态内部类
定义在HelloWorldConfiguration中，解决问题。

clientside模块是实现一个被授权客户端，从业务角度来看，客户端相对授权服务器是第三方应用程序，使用何种语言和技术是
不可知的，重点是流程而不是某种技术实现。作为j2ee开发者，我使用作者提供的SpringRestClient的内容用springMVC的形式展现,
见Oauth2ClientController.java。

视图渲染方面，clientside采用jsp，serverside采用Thymeleaf。
