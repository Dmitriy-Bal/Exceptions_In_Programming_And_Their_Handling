package org.example;

public class GenderException extends Exception {
    public GenderException() {
    }

    public void genderException(String i) {
        System.out.println("Exception: GenderNotCorrectData");
        System.out.printf("Это не верные данные: %s", i);
        System.out.println();
    }
}