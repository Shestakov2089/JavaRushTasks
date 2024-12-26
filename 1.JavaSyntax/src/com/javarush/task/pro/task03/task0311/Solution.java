package com.javarush.task.pro.task03.task0311;

import java.util.Scanner;

/* 
Высокая точность
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double num1 = scan.nextDouble();
        double num2 = scan.nextDouble();

        String eq = Math.abs(num2 - num1) < 0.000001 ? "числа равны" : "числа не равны";
        System.out.println(eq);
    }
}
