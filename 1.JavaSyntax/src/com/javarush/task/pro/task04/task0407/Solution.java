package com.javarush.task.pro.task04.task0407;

public class Solution {
    public static void main(String[] args) {
        int i = 0;
        int sum = 0;
        while(i<=100){
            if(i%3 == 0){
                i++;
                continue;
            }

            sum = sum + i;
            i++;

        }
        System.out.println(sum);

    }
}