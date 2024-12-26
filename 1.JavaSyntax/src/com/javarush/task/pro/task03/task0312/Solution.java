package com.javarush.task.pro.task03.task0312;

import java.util.Scanner;

/* 
Сравним строки
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s1 = scan.nextLine();
        String s2 = scan.nextLine();

        if(s1.equals(s2)) {
            System.out.println("строки одинаковые");
        }
        else
            System.out.println("строки разные");
    }
}
