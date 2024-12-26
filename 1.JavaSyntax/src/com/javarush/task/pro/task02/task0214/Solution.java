package com.javarush.task.pro.task02.task0214;

import java.util.Scanner;

/* 
Чтение и преобразование строк
*/

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text1 = scan.nextLine();
        String text2 = scan.nextLine();
        String text3 = scan.nextLine();

        System.out.println(text3);
        System.out.println(text2.toUpperCase());
        System.out.println(text1.toLowerCase());


    }
}
