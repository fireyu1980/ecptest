package com.sgcc.ecp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EcpApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcpApplication.class, args);
		System.out.println(1111);
		User[] usersOld = new User[3];
		User user1Old = new User();
		user1Old.setUserID("U1");
		user1Old.setUserName("zangO1");
		user1Old.setAge(21);
		User user2Old = new User();
		user2Old.setUserID("U2");
		user2Old.setUserName("zangO2");
		user2Old.setAge(22);
		User user3Old = new User();
		user3Old.setUserID("U3");
		user3Old.setUserName("zangO3");
		user3Old.setAge(23);
		usersOld[0]= user1Old;
		usersOld[1]= user2Old;
		usersOld[2]= user3Old;
		
		User[] usersNew = new User[3];
		User user1New = new User();
		user1New.setUserID("U1");
		user1New.setUserName("zangN1");
		user1New.setAge(21);
		User user2New = new User();
		user2New.setUserID("U2");
		user2New.setUserName("zangN2");
		user2New.setAge(22);
		User user3New = new User();
		user3New.setUserID("U3");
		user3New.setUserName("zangO3");
		user3New.setAge(24);
		usersNew[0]= user1New;
		usersNew[1]= user2New;
		usersNew[2]= user3New;
		

		List<User> usersLast = new ArrayList<User>();
		for(User user :usersOld) {
			for(User user1 :usersNew) {
				if(user.getUserID().equals(user1.getUserID())) {
					if(!user.getUserName().equals(user1.getUserName())) {//不等于
						usersLast.add(user1);
						continue;
					}
					if(!user.getAge().equals(user1.getAge())) {//不等于
						usersLast.add(user1);
						continue;
					}
				}
			}
		}
		for(User user3 :usersLast) {
			System.out.println(user3.getUserName());
		}
	}
}
