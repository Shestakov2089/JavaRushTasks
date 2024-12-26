package com.javarush.task.pro.task04.task0405;

/* 
Незаполненный прямоугольник
*/

public class Solution {
    public static void main(String[] args) {
        int count1 = 0;
        while(count1 < 10){
            int count2 = 0;
            while(count2 < 20){
                if(count1 == 0 || count1 == 9){
                    System.out.print("Б");
                } else if((count2 == 0) || (count2 == 19)) {
                    System.out.print("Б");
                } else {
                    System.out.print(" ");
                }
                count2++;
                }
            System.out.println();
            count1++;
            }

        }
    }
