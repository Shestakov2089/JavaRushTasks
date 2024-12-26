package com.javarush.task.pro.task04.task0402;

import java.util.Scanner;

/* 
Все любят Мамбу
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        String text = " любит меня.";
        int count = 0;
        while (count < 10){
            System.out.println(name + " " + text);
            count++;
        }

    }
}
