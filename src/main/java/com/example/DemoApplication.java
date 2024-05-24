package com.example;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoApplication {

		public static void main(String[] args) {
			
			ConfigurableApplicationContext xmlContext = new ClassPathXmlApplicationContext("beans.xml");
			Laboratory laboratory =  xmlContext.getBean("laboratory", Laboratory.class);
			System.out.println(laboratory.toString()); 


			ConfigurableApplicationContext javaContext = new AnnotationConfigApplicationContext(Config.class);
			Library libraryJava= javaContext.getBean(Library.class);
			libraryJava.issueBook();

			xmlContext.close();
			javaContext.close();
			
    }
}


 

	

