package se.lexicon.henric.spring_demo_annotations;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService{

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return "today is your lucky day!";
	}

}
