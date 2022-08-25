
package com.test.hib.model;

import java.util.Scanner;

import com.test.hib.controller.CreateUser;
import com.test.hib.controller.DeleteUser;
import com.test.hib.controller.UserTableActions;

public class Application {
  public static void main(String[] args) {
	  		//this line calls the static method CreateUsers from the CreateUser Class
			CreateUser.createUsers();
			//this line calls the static method deleteUser from the DeleteUser Class
	  		DeleteUser.deleteUser();
	
			Scanner sc = new Scanner(System.in);
			//using the alternative non-static UserTableActions implementation. 
			UserTableActions uta = new UserTableActions(sc);
			uta.createUsers();
			//this gets the the user with the specified ID
			System.out.print("Enter user ID to lookup:");
			int i = sc.nextInt();
			System.out.println(uta.getUser(i));
			uta.close();
  }
}
