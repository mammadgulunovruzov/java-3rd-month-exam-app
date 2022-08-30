package org.example.service;

import org.example.utility.InputUtility;
import org.example.entity.User;

public class LoginService {


    public static void checkLogin() {


        User user = new User();
        String userName = InputUtility.askString("Please enter your name");
        String userSurname = InputUtility.askString("Please enter your surname");

        user.setName(userName);
        user.setSurname(userSurname);



        System.out.println("Welcome " + user.getName()+" "+user.getSurname());


    }
}
