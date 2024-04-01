# boot_for_traditional_web_mvc
This the solution for how we create the traditional mvc same structure using spring boot project.

## Understanding
* by default when we create the spring starter project, there is only web server which contains servlet container and it only handles the request mapping and all.
* Something said to be the application server which contains both serverlet container and JSP container.
* By default spring boot offering tomcat which contains only web server.[Note : "Whitelabel Error Page This application has no explicit mapping for /error, so you are seeing this as a fallback. Mon Apr 01 21:30:54 IST 2024 There was an unexpected error (type=Not Found, status=404)." We can get this by hitting the URL: http://localhost:8080]. To resolve this we have to make over server application server.
* But in this project we have used the JSP so, to extend the server we additionally adding the embedded-jasper dependency.

step 1: Here if we compare the steps with traditional web-mvc ,we only written the controller class.
step 2: We have written the view page. ex. home.jsp
step 3: We have done the configuration for viewResolver in application.properties file.

## Conclusion
* So, In the traditional mvc developer has to conceentrate on configuration and bussiness logic.
* Whereas in spring boot , we don't need to write the front controller like DispatcherServlet and config file because it is taken care by spring boot itself and developer only has to focus on the bussiness logic.
* That's why spring boot known as the rapid application utility framework.

