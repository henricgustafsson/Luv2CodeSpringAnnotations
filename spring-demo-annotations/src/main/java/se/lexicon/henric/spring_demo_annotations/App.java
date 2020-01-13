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
    	Coach theCoach = context.getBean("tennisCoach",Coach.class);
    	//call a method on the bean
    	System.out.println(theCoach.GetDailyWorkout());
    	//close the context
    	context.close();
    	
    }
}
