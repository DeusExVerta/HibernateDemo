package com.test.hib.controller;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.cfg.Configuration;

import com.test.hib.model.User;


public class FindUser {
	public static void findUser() {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        
        boolean cont;
        Scanner sc= new Scanner(System.in);
        Integer id;
        do {
        	cont=false;
        	System.out.print("Enter u-id to lookup:");
        	id=sc.nextInt();
        	try {
	        	User u = session.load(User.class, id);
	        	System.out.println("Name: "+u.getFullname());
	        	System.out.println("Email: "+u.getEmail());
	        	System.out.println("Password: "+u.getPassword());
        	}catch(org.hibernate.ObjectNotFoundException ex) 
        	{
        		System.out.println(ex.getMessage());
        	}
        	
        	sc.nextLine();
        	System.out.print("Enter another user?(y to continue)");
        	cont = sc.nextLine().toLowerCase().matches("^y.*");
        }while(cont);
        System.out.println("terminated.");
        sc.close();
	}
}
