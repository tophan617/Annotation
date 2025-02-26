package ann.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

import ann.config.App_Config;

public class App {
	public static void main(String[] args) {
		//ApplicationContext applicationContext=new ClassPathXmlApplicationContext(null);
		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(App_Config.class);
	}
}
