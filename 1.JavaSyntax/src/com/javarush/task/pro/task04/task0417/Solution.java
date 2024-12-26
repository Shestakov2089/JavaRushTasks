package com.javarush.task.pro.task04.task0417;

import java.util.Scanner;

/* 
Скорость ветра
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int speed = scan.nextInt();
        int res = (int)(Math.round(speed*3.6));
        System.out.println(res);

    }
}