package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoApplication {

	
		public static void main(String[] args) {
			
			ApplicationContext xmlContext = new ClassPathXmlApplicationContext("beans.xml");
			 
			Library libraryXml = (Library) xmlContext.getBean("library");
			libraryXml.issueBook();

			ApplicationContext javaContext = new AnnotationConfigApplicationContext(Config.class);
			Library libraryJava= javaContext.getBean(Library.class);
			libraryJava.issueBook();
    }
}


 

	

