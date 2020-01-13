package se.lexicon.henric.spring_demo_annotations;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	private String[] data = {
			"Beware of capitalism",
			"Solidarity & kindness pays off",
			"The journey towards socialism is the reward"
	};
	
	private Random myRandom = new Random();
	
	@Override
	public String getFortune() {
		//Pick a random string from array
		int index = myRandom.nextInt(data.length);
		
		return data[index];
	}

}
