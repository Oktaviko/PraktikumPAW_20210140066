package com.helloworld.helloworld;

public class overloading {
    public static void main(String[] args) {
        sayHello();
        sayHello("Oktaviko");
        sayHello("Oktaviko","viko");
    }
    String firstname = "Oktaviko";
    String lastname = "viko";

    static void sayHello() {
        System.out.println(" Hello ");
    }

    static void sayHello(String firstname) {
        System.out.println("Hello " + firstname);
    }

    static void sayHello(String firstname, String lastname) {
        System.out.println("Hello " + firstname + " " + lastname);
    }

}
