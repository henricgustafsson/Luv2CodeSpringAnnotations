package se.lexicon.henric.spring_demo_annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class JavaconfigDemo 
{
    public static void main( String[] args )
    {
    	//read spring config file
    	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
    	//get the bean from spring container
    	Coach theCoach = context.getBean("swimCoach",Coach.class);
    	//call a method to get the daily fortune
    	System.out.println(theCoach.getDailyWorkout());
    	//call a method on the bean
    	System.out.println(theCoach.getDailyFortune());
    	//close the context
    	context.close(); 
    	
    	
    	
    }
}
