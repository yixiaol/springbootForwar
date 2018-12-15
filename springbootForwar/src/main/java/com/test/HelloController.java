package com.test;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



/**
 * springboot启动类
 * @author yixl
 *
 *ps 部署到tomcat 中 需要 extends SpringBootServletInitializer
 * 访问方式为：localhost:8080/yixlWar/hello
 *           8080 tomcat 端口号   yixlWar tomcat/webApps 中 的项目名
 *并实现 configure 方法
 */
@RestController
public class HelloController extends SpringBootServletInitializer{
	@RequestMapping("hello")
	String hello() {
		return "Hello World!";
	}

	@Override 
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		////此处的Application.class为带有@Application注解的启动类
		return application.sources(Application.class);
	}
	
}
