package com.BelajarOOP;

public class AppManager {
    public static void main(String[] args) {
        var manager = new Manager();
        manager.name = "Rizki";
        manager.sayHello("Oktaviko");

        var vicePresident = new VicePresident();
        vicePresident.name = "Okta";
        vicePresident.sayHello("Pratama");
    }
}