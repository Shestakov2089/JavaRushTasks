package com.javarush.task.pro.task04.task0418;

import java.util.Scanner;

/* 
Стакан наполовину пуст или наполовину полон?
*/

public class Solution {
    public static void main(String[] args) {
        double glass = 0.5;
        int x = 0;
        Scanner scan = new Scanner(System.in);
        boolean res = scan.nextBoolean();
        if(res == true){
            x = (int)(Math.ceil(glass));
        }
        if(res == false){
            x = (int)(Math.floor(glass));
        }
        System.out.println(x);


    }
}