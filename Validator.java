package com.bridgelabs.userRegistration;

import java.util.regex.Pattern;

public class Validator {
    /* Creating and initializing pattern for user details */
    private static final String FIRST_NAME_PATTERN = "^[A-Z][a-z]{3,}";
    private static final String LAST_NAME_PATTERN = "^[A-Z][a-z]{3,}";

    /* Validating first name with pattern */
    public boolean validateFirstName(String firstName) {
        return Pattern.matches(FIRST_NAME_PATTERN, firstName);
    }

    /* Validating last name with pattern*/
    public boolean validateLastName(String lastName) {
        return Pattern.matches(LAST_NAME_PATTERN, lastName);
    }
}
