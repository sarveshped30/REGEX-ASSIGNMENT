/* User registration using regex
 * RFP assignment
 * Author: Sarvesh Pednekar */

package com.bridgelabs.userRegistration;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import java.util.Scanner;

/* Creating user class for storing names in variables using setters */
class User {
    private String firstName;
    private String lastName;

    /* Creating object for validator class */
    Validator validate = new Validator();

    /* Creating Getters and Setters */

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        // Checking if user input matches the pattern
        if(validate.validateFirstName(firstName)) {
            this.firstName = firstName;     // Assigning value to firstName
            System.out.println("Valid");
        } else {
            System.out.println("Invalid pattern for first name");
        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        // Checking if user input matches the pattern
        if(validate.validateLastName(lastName)) {
            this.lastName = lastName;       // Assigning value to lastName
            System.out.println("Valid");
        } else {
            System.out.println("Invalid pattern for Last name");
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
