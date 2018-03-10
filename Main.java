package com.company;
import java.util.Scanner;
//Программа поиск максимального и минимального элемента массива

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Объявляем Scanner
        System.out.println("Введите размер массива: ");
        int size = input.nextInt(); // Читаем с клавиатуры размер массива и записываем в size
        int array[] = new int[size]; // Создаём массив int размером в size
        System.out.println("Введите элементы массива:");
        /*Пройдёмся по всему массиву, заполняя его*/
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt(); // Заполняем массив элементами, введёнными с клавиатуры
        }
        System.out.print("Это то, что вы ввели:");
        for (int i = 0; i < size; i++) {
            System.out.print(" " + array[i]); // Выводим на экран, полученный массив
        }
        System.out.println();

        int max = array[0];
        int min = array[0];

        for (int h = 0; h < array.length; h++) { //почему здесь нет ни какой раздницы будет то переменная h или i?
            // она (переменная i) ведь ранее использовалась
            if (max < array[h])
                max = array[h];
            if (min > array[h])
                min = array[h];
        }
        System.out.println("Максимальный элемент массива: " + max);
        System.out.println("Минимальный элемент массива: " + min);
    }
}