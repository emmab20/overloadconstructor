package com.overloadconstructor;

public class PotentialEmployee {
    private String firstName = "";
    private String lastName = "";
    private String email = "";
    private String ssn = "";

    public PotentialEmployee(String firstName, String lastName, String email, String ssn) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.ssn = ssn;
    }

    public PotentialEmployee(String email, String ssn) {
        this.email = email;
        this.ssn = ssn;
    }

    public PotentialEmployee(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSSN() {
        return ssn;
    }

    public void setSSN(String ssn) {
        this.ssn = ssn;
    }
}
