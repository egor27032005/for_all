package com.company;

import java.util.Scanner;
///Найти номеры тех элементов массива, которые больше своего левого соседа, и количество таких элементов.
// Найденные номеры выводить в порядке их убывания.
public class For_me {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[]{-86, -45, -43, -41, -39, -37, -37, -17, -16, 0, 14, 29, 40, 54, 63, 66, 82, 86};
        int a =sc.nextInt();
            for (int i = 0; i < arr.length; i++) {
                if(arr[i]<a)
                System.out.print(arr[i] + " ");
            }
        }




    }

