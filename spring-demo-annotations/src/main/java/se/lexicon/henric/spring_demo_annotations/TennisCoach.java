package se.lexicon.henric.spring_demo_annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	private FortuneService fortuneService;
	
	public TennisCoach() {
		//default constructor
	}
	
	// using setter injection instead of constructor
	// injection
//	@Autowired
//	public TennisCoach(FortuneService theFortuneService) {
//		fortuneService = theFortuneService;
//	}
	
	
	public String getDailyWorkout() {
		
		return "Practice your backhand volley";
	}

	

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

	//setter for field FortuneService fortuneService
	@Autowired
	public void doSomeCrazyStuff(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
}
