package se.lexicon.henric.spring_demo_annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("se.lexicon.henric.spring_demo_annotations")
@PropertySource("classpath:sport.properties")
public class SportConfig {
	
	//define a bean for sad fortune service
	
	 @Bean
	 public FortuneService sadFortuneService() {
		 return new sadFortuneService();
	 }
	
	//define a bean for swimcoach and inject dependency
	
	 @Bean 
	 public Coach swimCoach() {
		 return new SwimCoach(sadFortuneService());
	 }
}
