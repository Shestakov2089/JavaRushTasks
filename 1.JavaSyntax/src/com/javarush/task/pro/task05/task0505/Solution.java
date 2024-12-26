package com.javarush.task.pro.task05.task0505;

import java.util.Scanner;

/* 
Reverse
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt();
        int[] array = new int[count];

        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
        }
        if(count%2 == 0){
            for (int i = count-1; i >= 0; i--) {
                System.out.println(array[i]);
            }
        }
        else if(count%2 != 0){
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
            }
        }

    }
}
