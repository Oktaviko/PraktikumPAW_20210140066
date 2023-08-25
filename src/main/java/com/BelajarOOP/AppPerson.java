package com.BelajarOOP;

public class AppPerson {
    public static void main(String[] args) {
        var person1 = new Person("okta 1", "yogya 1");
        // Person person2 = new Person();

        // Person person3;
        // person3 = new Person();

        person1.name = "Okta 2 ";
        person1.address = "Yogya 2 ";
        // person1.country = "Tidak bisa diubah";

        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);

        person1.sayHello("Print tulisan");

    }
}