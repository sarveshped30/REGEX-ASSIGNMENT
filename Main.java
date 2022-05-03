/* Java regex assignment
 * RFP assignment
 * Author: Sarvesh Pednekar */

package com.bridgelabs.userRegistration;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import java.util.Scanner;

class User {
    /* Creating variables for user details */
    private String firstName;
    private String lastName;
    private String emailId;
    private String number;
    private String password;

    /* Creating object of validator */
    Validator validate = new Validator();

    /* Creating getter and setters method for initializing and calling user info */

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        // Validating user input with pattern
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
        // Validating user input with pattern
        if(validate.validateLastName(lastName)) {
            this.lastName = lastName;
            System.out.println("Valid");
        } else {
            System.out.println("Invalid pattern for last name");

        }
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        // Validating user input with pattern
        if(validate.validateEmail(emailId)) {
            this.emailId = emailId;
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        // Validating user input with pattern
        if(validate.validateNumber(number)) {
            this.number = number;
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        // Validating user input with pattern
        if(validate.validatePassword(password)) {
            this.password = password;
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }
}

public class Main {
    static Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        BasicConfigurator.configure();
        User user =  new User();
        Scanner sc = new Scanner(System.in);

        /* Taking user input for every User info */
        System.out.println("Enter first name: ");
        user.setFirstName(sc.next());

        System.out.println("Enter last name : ");
        user.setLastName(sc.next());

        System.out.println("Enter email id: ");
        user.setEmailId(sc.nextLine());

        System.out.println("Enter number: ");
        user.setNumber(sc.nextLine());

        System.out.println("Enter password: ");
        user.setPassword(sc.nextLine());
    }
}
