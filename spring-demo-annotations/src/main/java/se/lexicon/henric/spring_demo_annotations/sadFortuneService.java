package se.lexicon.henric.spring_demo_annotations;

public class sadFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		
		return "Sooo #sad";
	}

}
