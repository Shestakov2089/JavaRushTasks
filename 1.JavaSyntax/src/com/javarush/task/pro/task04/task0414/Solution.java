package com.javarush.task.pro.task04.task0414;

import java.util.Scanner;

/* 
Хорошего не бывает много
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int num = scan.nextInt();
        do{
            System.out.println(s);
            num--;
        } while(num > 0 && num < 4);

    }
}