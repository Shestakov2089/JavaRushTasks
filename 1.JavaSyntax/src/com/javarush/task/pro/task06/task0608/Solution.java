package com.javarush.task.pro.task06.task0608;

/* 
Кубический калькулятор
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long num = scan.nextLong();

        System.out.println(cube(num));
    }

    public static long cube(long a){
        long b = a*a*a;
        return b;
    }
}
