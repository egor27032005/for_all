package com.company;
import java.util.*;
public class Ex002_HashMapEntry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //String str = sc.nextLine();
        ///String str2=sc.nextLine();
        String str="8025+8561+5653+4458+8896+9840";
        char plus ='+';
        char minus='-';
        int sum=0;
        char[] arr = str.toCharArray();
        int len1 = arr.length;
        int j=0;
        while(arr[j]!=plus && j<6){
            j++;
        }
        if(j==6){
            j=0;
            while(arr[j]!=minus && j<6){
                j++;
            }
        }
        String res = str.substring(0, j);
        int m=Integer.parseInt(res);
        sum=sum+m;
        System.out.println(sum);
        for (int i = j+2; i < len1; i++) {
            if(arr[i]==plus){
                String res2="";
                res2 = str.substring(j, i-1);
                int n=Integer.parseInt(res2);
                sum=sum+n;
                j=i;
                System.out.println(sum);
            }

        }
        System.out.print(sum);
    }
}

