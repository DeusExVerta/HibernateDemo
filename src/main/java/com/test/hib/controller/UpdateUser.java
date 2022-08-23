package com.test.hib.controller;


import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.test.hib.model.User;


public class UpdateUser {
	public static void updateUser() 
	{
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
    	Session session = factory.openSession();
    	Transaction t = session.beginTransaction();
		User user = new User();
		Scanner sc = new Scanner(System.in);
		boolean cont;
		do {
		 	cont = false;
		 	System.out.print("Enter User Email:");
		 	user.setEmail(sc.nextLine());
			System.out.print("Enter User Name:");
			user.setFullname(sc.nextLine());
			System.out.print("Enter Password:");
			user.setPassword(sc.nextLine());
			System.out.print("Enter Salary:");
			user.setSalary(sc.nextDouble());
			sc.nextLine();
			System.out.print("Enter Age:");
			user.setAge(sc.nextInt());
			sc.nextLine();
			System.out.print("Enter City:");
			user.setCity(sc.nextLine());
			
			//the only difference between this and create user
			session.merge(user);
			System.out.print("Update another user?(y to continue)");
			cont = sc.nextLine().toLowerCase().matches("^y.*");
		}while(cont);
		System.out.println("terminated.");
		sc.close();
		t.commit();
		System.out.println("successfully saved");   
		factory.close();  
		session.close();
	}
}
