package com.tss.addressbook;


public class Person {
    private String firstName;
    private String lastName;
    private String homeAddress;
    private String phoneNumber;
    private String emailAddress;

    public Person(String firstName, String lastName, String homeAddress, String phoneNumber, String emailAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.homeAddress = homeAddress;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    public Person() {

    }

    public String getInput(){
        return firstName + " " + lastName + "\n" +
                ", phone number: " + phoneNumber + "\n" +
                ", Residence: "  + homeAddress + "\n" +
                ", Email: " + emailAddress;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName() {
        this.lastName = lastName;
    }

    public void setHomeAddress() {
        this.homeAddress = homeAddress;
    }

    public void setPhoneNumber() {
        this.phoneNumber = phoneNumber;
    }

    public void setEmailAddress() {
        this.emailAddress = emailAddress;
    }

}


