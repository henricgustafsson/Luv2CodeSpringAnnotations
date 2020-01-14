package se.lexicon.henric.spring_demo_annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//read spring config file
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    	//get the bean from spring container
    	Coach theCoach = context.getBean("swimCoach",Coach.class);
    	//call a method to get the daily fortune
    	System.out.println(theCoach.getDailyWorkout());
    	//call a method on the bean
    	System.out.println(theCoach.getDailyFortune());
    	//close the context
    	context.close(); 
    	
    	/** 
    	SwimCoach theSwimCoach = (SwimCoach) context.getBean("swimCoach",Coach.class);
    	//call a method to get the daily fortune
    	System.out.println(theSwimCoach.getDailyWorkout());
    	//call a method on the bean
    	System.out.println(theSwimCoach.getDailyFortune());
    	//get email injected from sport.properties
    	System.out.println(theSwimCoach.getEmail());
    	//get team injected from sport.properties
    	System.out.println(theSwimCoach.getTeam());*/
    	//close the context
    	//context.close(); 
    	
    }
}
