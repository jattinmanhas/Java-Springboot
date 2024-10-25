package com.springRest.restful_web_services.versioning;

public class Name {
    private String FirstName;
    private String LastName;

    public Name(String firstName, String lastName) {
        FirstName = firstName;
        LastName = lastName;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    @Override
    public String toString() {
        return "Name{" +
                "FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                '}';
    }
}