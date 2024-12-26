package com.javarush.task.pro.task04.task0406;

import java.util.Scanner;


public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(true){
            String word = scan.nextLine();
            if(word.equalsIgnoreCase("enough")){
                break;
            }
            System.out.println(word);
        }


    }
}