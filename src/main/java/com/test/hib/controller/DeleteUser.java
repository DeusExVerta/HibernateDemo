package com.test.hib.controller;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.test.hib.model.User;

public class DeleteUser {
	public static void deleteUser() {
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
	        	session.delete(u);
        	}catch(org.hibernate.ObjectNotFoundException ex) 
        	{
        		System.out.println(ex.getMessage());
        	}
        	
        	sc.nextLine();
        	System.out.print("Delete another user?(y to continue)");
        	cont = sc.nextLine().toLowerCase().matches("^y.*");
        }while(cont);
        System.out.println("terminated.");
        sc.close();
	}
}
