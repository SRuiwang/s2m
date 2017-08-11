idea maven 整合s2m
需要注意，将mybatis的mapper.xml目录方法resource里，方能找到，放在dao中编译输出 会忽略非java文件
待以后看有没有解决方法………………


部署：
1.使用idea发布web项目时，无法访问tomcat主页：
deal: edit configurations -> deployment -> 添加tomcat root 目录
2.自己创建的web项目无法发不到tomcat时:
deal:检查artifacts中，需要添加model 'web'
3.如果还不行，Build -> build artifacts -> all artifacts -> rebuild


2017-8-11
mvc 使用 return forward|redirect 注意
无法重定向到/web-inf/pags/下，因为无访问权限，所以会报错找不到
应该redirect -> xxx.do  通过另一个请求跳转实现重定向