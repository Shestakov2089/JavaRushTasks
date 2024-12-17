package com.javarush.task.pro.task05.task0508;

import java.util.Scanner;

/* 
Удаляем одинаковые строки
*/

public class Solution {
    public static String[] strings;

    public static void main(String[] args) {
        strings = new String[6];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < strings.length; i++){
            strings[i] = scan.nextLine();
        }

        for (int i = 0; i < strings.length; i++) {
            String tmp = strings[i];
            for (int j = i+1; j < strings.length ; j++) {
                if (tmp == null) break;

                if (tmp.equals(strings[j])) {
                    strings[i] = null;
                    strings[j] = null;
                }
            }
        }

        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + ", ");
        }
    }
}
