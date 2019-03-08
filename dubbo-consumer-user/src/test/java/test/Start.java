package test;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dubbo.service.UserService;

public class Start {
	public static void main(String[] args) throws IOException {
		//测试常规服务
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		context.start();
		System.out.println("consumer user start");
		UserService userService = context.getBean(UserService.class);
		System.out.println("consumer user");
		System.out.println(userService.getName("1"));
	}
}
