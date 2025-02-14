package com.survey;

public class Candidate {

    private String firstName;
    private String lastName;
    private String email;
    private String phoneNr;

    public Candidate(String firstName, String lastName, String email, String phoneNr) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNr = phoneNr;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNr() {
        return phoneNr;
    }
}
