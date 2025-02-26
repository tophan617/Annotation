package ann.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "ann")
public class App_Config {

	public App_Config() {
		System.out.println("Config :: Constructor.");
	}
	
	@Bean
	public Engine getEngine() {
		Engine engine=new Engine();
		return engine;
	}
}
