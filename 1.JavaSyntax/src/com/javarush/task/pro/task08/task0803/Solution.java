package com.javarush.task.pro.task08.task0803;

import java.util.Arrays;
import java.util.Scanner;

/* 
Минимальный элемент массива
*/

public class Solution {

    public static void main(String[] args) {
        int[] intArray = getArrayOfTenElements();
        System.out.println(Arrays.toString(intArray));
        System.out.println(min(intArray));
    }

    public static int min(int[] ints) {
        int min = ints[0];
        for (int num: ints) {
            min = Math.min(num, min);
        }
        return min;
    }

    public static int[] getArrayOfTenElements() {
        Scanner scan = new Scanner(System.in);
        int [] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
        }
        return array;
    }
}
