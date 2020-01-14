package se.lexicon.henric.spring_demo_annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	//@Autowired
	//@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	public TennisCoach() {
		//default constructor
	}
	
	// using setter injection instead of constructor
	// injection
	@Autowired
	public TennisCoach(@Qualifier("randomFortuneService") FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	
	//init method
	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println("inside domystartupstuff");
	}
	
	
	//destroy method
	@PreDestroy
	public void doMyClenaupStuff() {
		System.out.println("inside doMyCleanupStuff");
	}
	
	public String getDailyWorkout() {
		
		return "Practice your backhand volley";
	}

	

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

	//setter for field FortuneService fortuneService
//	@Autowired
//	public void doSomeCrazyStuff(FortuneService fortuneService) {
//		this.fortuneService = fortuneService;
//	}
}
