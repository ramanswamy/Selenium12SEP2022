package com.tekparams.basics;

public class Address {
    // Data Members
    String DNo;
    String street;
    String city;
    int pin;

    // Methods
    public void printAddress(){
        System.out.println(DNo+"\n"+street+"\n"+city+"\n"+pin);
    }

    // Default Constructor
    Address(){
        DNo="D100";
        street="Street1";
        city="Bangalore";
        pin=560076;
    }
    // Parameterized constructor
    Address(String DNo, String Street, String City, int pin){
        this.DNo=DNo;
        this.street=Street;
        this.city=City;
        this.pin=7987987;
    }

    public static void main(String[] args){
        Address address = new Address();
        Address address1 = new Address("D200","Street2","Bangalore",560076);
        address.printAddress();
        address1.printAddress();
        address.DNo="A100";
        address.street="abc";
        address.city="Bangalore";
        address.pin=560076;
        address.printAddress();
    }
}
