package com.javarush.task.pro.task05.task0513;

import java.util.Arrays;


public class Solution {

    public static String[] strings = new String[]{"I", "love", "Java"};
    public static int[] ints = new int[]{1, 2, 3, 4, 5, 6, 7, 8};

    public static void main(String[] args) {
        String num = Arrays.toString(ints);
        String word = Arrays.toString(strings);

        System.out.println(num);
        System.out.println(word);
    }
}
