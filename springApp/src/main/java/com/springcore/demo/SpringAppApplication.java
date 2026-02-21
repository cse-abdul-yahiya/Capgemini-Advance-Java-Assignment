package com.springcore.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringAppApplication {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(SpringAppApplication.class, args);
//		System.out.println("Hello World");
////		Car car1 = new  Car();
//		Car car1 = context.getBean(Car.class);
//		Car car2 = context.getBean(Car.class);
//		System.out.println(car1);
//		System.out.println(car2);
//		Vehicle vehicle =  context.getBean(Vehicle.class);
		Vehicle vehicle = context.getBean("car", Vehicle.class);
		vehicle.run();
	}

}
