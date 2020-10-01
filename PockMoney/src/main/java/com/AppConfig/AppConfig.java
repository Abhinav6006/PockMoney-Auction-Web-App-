package com.AppConfig;


	import org.springframework.context.annotation.Bean;
	import org.springframework.context.annotation.ComponentScan;
	import org.springframework.context.annotation.Configuration;
	import org.springframework.web.servlet.config.annotation.EnableWebMvc;
	import org.springframework.web.servlet.view.InternalResourceViewResolver;
	//import org.springframework.stereotype.Component;

	@Configuration
	@ComponentScan("com")
	@EnableWebMvc
	public class AppConfig {
		@Bean
		public InternalResourceViewResolver getResolver(){
			InternalResourceViewResolver rp=new InternalResourceViewResolver();
			rp.setPrefix("/");
			rp.setSuffix(".jsp");
			return rp;
			
		}
		
		
	}

