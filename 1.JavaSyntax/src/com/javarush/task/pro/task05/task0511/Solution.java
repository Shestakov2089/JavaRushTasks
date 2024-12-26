package com.javarush.task.pro.task05.task0511;

import java.util.Scanner;

/* 
Создаем двумерный массив
*/

public class Solution {
    public static int[][] multiArray;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());
        multiArray = new int [num][];

        for (int i = 0; i < num; i++) {
            int size = Integer.parseInt(scan.nextLine());
            multiArray[i] = new int[size];
        }
    }
}
