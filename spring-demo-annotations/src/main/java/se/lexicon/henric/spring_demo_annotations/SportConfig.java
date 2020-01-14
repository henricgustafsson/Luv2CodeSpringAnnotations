package se.lexicon.henric.spring_demo_annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("se.lexicon.henric.spring_demo_annotations")
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
