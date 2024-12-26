package com.javarush.task.pro.task05.task0506;

import java.util.Scanner;


public class Solution {
    public static int[] array;

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int size = Integer.parseInt(scan.nextLine());
        array = new int[size];
        int min;

        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(scan.nextLine());
        }
        min = array[0];
            for (int j = 1; j < array.length; j++) {
                int num = array[j];
                if(min > num){
                    min = array[j];
                }
            }
        System.out.println(min);
    }
}
