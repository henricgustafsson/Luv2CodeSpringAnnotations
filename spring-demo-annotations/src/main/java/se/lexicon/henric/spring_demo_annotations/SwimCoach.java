package se.lexicon.henric.spring_demo_annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("swimCoach")
public class SwimCoach implements Coach {

	
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	@Autowired
	@Value("${foo.email}")
	private String email;
	
	@Autowired
	@Value("${foo.team}")
	private String team;

	public SwimCoach() {
		// TODO Auto-generated constructor stub
	}
	public String getEmail() {
		return email;
	}
	public String getTeam() {
		return team;
	}
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Do the butterfly";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
