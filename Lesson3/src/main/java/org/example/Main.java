package org.example;

import java.util.HashMap;

// Запуск приложения

public class Main {
    public static void main(String[] args) {
        ParsData parsData = new ParsData(); // Создание объекта класса ParsData.
        String newFileName = null; // Инициализация переменной
        WriteFile writeFile = new WriteFile(); // Создание объекта класса WriteFile.

        HashMap<String, Object> data = parsData.parsInputData(); // Инициализация словаря.
        while (data.size() != 6) {
            try {
                throw new DataException();
            } catch (DataException e) {
                data = parsData.parsInputData();
            }
        } // Повторение цикла ввода данных пользователя; до полного ввода корректных данных.

        newFileName = data.get("lastName") + ".txt"; // Указывается файл для записи данных пользователя.
        StringBuilder sb = new StringBuilder();
        for (String str : data.keySet()) {
            sb.append(data.get(str));
            sb.append(" ");
        }


        System.out.println(data);
        String filePath = newFileName;
        System.out.println(filePath);
        writeFile.writeData(String.valueOf(sb), filePath); // Вызов метода класса WriteFile, для записи в файл.

    }
}