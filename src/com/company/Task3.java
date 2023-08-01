package com.company;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        ///String str2=sc.nextLine();
        //String str = "CZXWoBfppTRNzvFFZIQeUKSkghiUounUHxgSPnGXmjZpEPwnfqGRvWGgmKhzMplkDsWUbLtdcLFTnWjDgXoOADxWOMhERPxrYHqtJN6WjydubFrTzcQNHfad5qXIPFRvXjzn5rYBvcIY8sCSEOy0seHDPqGFYZrLUjzySGcxnvEubTFAFcUPFgVXBHcAGvQ8CgAMOWWRXXjv4vcsCeLqFmiKdJfgPGAtXFGnGesoDMWVSqptDVPbZSVljPBtIGutWZRPbpBsX5UYfbYcYaZCPCICJaNxdFmbkbRAZng";
        char[] arr = str.toCharArray();
        int len1 = arr.length;
        char []arr2={'0','1','2','3','4','5','6','7','8','9'};
        int t=0;
        char fm=' ';
        int min=1000;
        for (int i = 0; i < len1; i++) {
            for (int j = 0; j < 10; j++) {
                if (arr[i] == arr2[j] && min > i) {
                    min = i;
                    fm = arr[i];
                }
            }
        }
        for (int i = 0; i < len1; i++) {
            if(arr[i]==fm)
                t++;

        }
        if(t!=0)
            System.out.print(fm+" "+t);
        else
            System.out.print("НЕТ");
    }
}
///SKAklYVdrxscQEPTKrnoOSZMnNwOaASfNoLOgYOvJFvqMZvLaSWUbNJbWYXuNzkcKT5H3OpoooqZUxmNLmcaYMLTxYatNYPFtGJHPqWYLi4V4aUJPBErfLIKJRzpE4wuoylGxPJAHNhuWVFsXGJmI7vRiabuQvQoTTbeEGoHBPtQNFdhDODsrimiDzeZpgRTGmlrYYZNnuDyBZoFAKEsYhyINenf5KljgCIqWZQSnjjcn0TbenHGizGQzAzcEBIfnokTyvRcNqjotNGtyIUprNjwzHNKzjzvHljKp6YSXderQZrbenU
/// 0
///o O