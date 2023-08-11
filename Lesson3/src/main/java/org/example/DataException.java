package org.example;

public class DataException extends Exception {
    public DataException() {
    }

    public void dataException(String i) {
        System.out.println("Exception: DateNotCorrectFormat");
        System.out.printf("Это неправильный формат данных: %s", i);
        System.out.println();
    }
}