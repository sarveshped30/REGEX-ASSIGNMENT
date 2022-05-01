package com.bridgelabs.userRegistration;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import java.util.Scanner;

class User {
    private String firstName;
    private String lastName;

    Validator validate = new Validator();

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if(validate.validateFirstName(firstName)) {
            this.firstName = firstName;
            System.out.println("Valid");
        } else {
            System.out.println("Invalid pattern for first name");
        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if(validate.validateLastName(lastName)) {
            this.lastName = lastName;
        }
    }
}

public class Main {
    static Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        BasicConfigurator.configure();
        User user =  new User();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first name: ");
        user.setFirstName(sc.next());

        System.out.println("Enter last name : ");
        user.setLastName(sc.next());
    }
}
