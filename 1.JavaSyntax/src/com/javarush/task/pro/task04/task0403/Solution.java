package com.javarush.task.pro.task04.task0403;

import java.util.Scanner;

/* 
Суммирование
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;

        while(scan.hasNextInt()){
            int num = scan.nextInt();
            sum = sum + num;
        }
        System.out.println(sum);

    }
}