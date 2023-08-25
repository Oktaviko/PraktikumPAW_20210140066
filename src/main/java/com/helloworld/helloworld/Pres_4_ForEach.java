package com.helloworld.helloworld;

public class Pres_4_ForEach {
    public static void main(String[] args) {
        String [] array = {
            "Okta", "Viko", "RIzki",
            "Pratama", "Alfi","Zahra"
        };
        for (var value : array){
            System.out.println(value);
        }
    }
}
