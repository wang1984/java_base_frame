package mytest;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SessionFactoryTest{
	@Test
	public void testSessionFactory(){
		ApplicationContext context  = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
		context.getBean("sessionFactory");
	}
}
