package se.lexicon.henric.spring_demo_annotations;

import org.springframework.stereotype.Component;

@Component("thatSillyCoach")
public class TennisCoach implements Coach {

	public String GetDailyWorkout() {
		
		return "Practice your backhand volley";
	}

}