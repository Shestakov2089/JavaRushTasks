package com.javarush.task.pro.task04.task0416;

import java.util.Scanner;

/* 
Share a Coke
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cola = scan.nextInt();
        int people = scan.nextInt();
        double rez = cola*1.0/people;
        System.out.println(rez);

    }
}