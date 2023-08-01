package com.company;
///import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //String str = sc.nextLine();
        ///String str2=sc.nextLine();

        String str = "ttttnnnnnnniugfniyu8fbitfdvuutvvyvgvtyb";

        char[] arr = str.toCharArray();
        int len1 = arr.length;
        char[] arr2 = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
        int t = 0;
        char fil = ' ';
        for (int i = 0; i < len1; i++) {
            for (int j = 0; j < 10; j++) {
                if (arr[i] == arr2[j]) {
                    fil = arr[i];
                    break;
                }

            }

        }
        System.out.print(fil);

    }
}