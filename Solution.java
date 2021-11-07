package com.javarush.task.task13.task1319;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;

/* 
Писатель в файл с консоли
Прочесть с консоли имя файла.
Считывать строки с консоли, пока пользователь не введет строку "exit".
Записать абсолютно все введенные в п.2 строки в файл: каждую строчку — с новой строки.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String outputFileName = reader.readLine();// файл куда будем записывать

        BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName)); //открываем поток на запись
        BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in)); // читаем с консоли строки, которые будет писать в файл
        String line = reader1.readLine();

        while (!line.equals("exit")){
            writer.write(line + "\n");
            line = reader1.readLine();
        }
        writer.write(line + "\n"); //записываем exit после выхода из цикла
        writer.close(); //закрываем поток
    }
}
