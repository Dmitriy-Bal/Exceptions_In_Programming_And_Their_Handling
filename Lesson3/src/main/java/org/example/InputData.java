package org.example;

import java.util.Scanner;

public class InputData {
    public String[] enterData() {
        Scanner iScanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите данные через 'пробел' (данные вводятся латинскими буквами," +
                    "одной строкой без запятых Ф.И.О, " +
                    "дату рождения - dd.mm.yyyy," +
                    "номер телефона начинается с 8," +
                    "пол - f/m ) : ");
            String data = iScanner.nextLine();
            String[] arrayData = data.split(" ");
            if (arrayData.length == 6) {
                return arrayData;
            } else if (arrayData.length < 6) {
                System.out.println("Вы ввели не все данные, пожалуйста, повторите попытку");
            } else System.out.println("Вы ввели лишние данные, пожалуйста, повторите попытку");
        }
    }
}