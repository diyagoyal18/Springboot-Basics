package com.diya.MyAPP;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MyAppApplication {
	
	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(MyAppApplication.class, args); // This is the main method which will run the application
		// SpringApplication.run(MyAppApplication.class, args); // This is the main method which will run the application
		// //run the container and start the server

		// Dev dev = new Dev(); // This is an object of the Dev class which is created manually outside the container
		// dev.build();


		Dev obj = context.getBean(Dev.class); // This is an object of the Dev class which is created inside the container
		obj.build();
		// Dev obj = (Dev)context.getBean("dev"); // This is an object of the Dev class which is created inside the container
	}

}
