package com.helloworld.helloworld;

public class SwitchStatement {
    public static void main(String[] args) {
        var nilai = "B";
        switch (nilai) {
            case "A":
                System.out.println("Anda lulus dengan baik");
                break;
            case "B":
                System.out.println("Anda lulus bagus");
                break;
            case "C":
                System.out.println("Anda lulus");
                break;
            case "D":
                System.out.println("Anda Tidak lulus");
                break;
            default:
                System.out.println("Mungkin anda salah jurusan");

        }
    }
}
