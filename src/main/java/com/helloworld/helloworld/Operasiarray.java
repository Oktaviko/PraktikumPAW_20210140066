package com.helloworld.helloworld;

public class Operasiarray {
    public static void main(String[] args) {
        long[] arraylong = {
            10, 90, 80, 67, 29
};

arraylong[0] = 100;
        System.out.println(arraylong[0]);
        System.out.println(arraylong[1]);
        System.out.println(arraylong.length);

        String[][] members = {
                        { "Farhan", "Taufiqul", "Ihsan" },
                        { "Joko", "Purwanto" },
                        { "Iwan", "Abdul" }
        };

        String[] member1 = members[0];
        System.out.println(member1[0]);

        System.out.println(members[1][0]);
        System.out.println(members[2][0]);
    }
}
