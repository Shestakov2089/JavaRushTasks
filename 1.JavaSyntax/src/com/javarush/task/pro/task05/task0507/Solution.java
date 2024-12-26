package com.javarush.task.pro.task05.task0507;

import java.util.Scanner;

/* 
Максимальное из N чисел
*/

public class Solution {
    public static int[] array;

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int size = Integer.parseInt(scan.nextLine());
        array = new int[size];

        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(scan.nextLine());
        }

        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            int num = array[i];
            if(max < num){
                max = num;
            }
        }
        System.out.println(max);
    }
}
