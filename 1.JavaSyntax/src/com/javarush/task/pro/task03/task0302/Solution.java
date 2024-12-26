package com.javarush.task.pro.task03.task0302;

import java.util.Scanner;

/* 
Призывная кампания
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        int age = scan.nextInt();
        String militaryCommissar = ", явитесь в военкомат";

        if(age >= 18 && age <= 28){
            System.out.println(name + militaryCommissar);
        }



    }
}
