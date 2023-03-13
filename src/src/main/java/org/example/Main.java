package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, k;
        int[] divisor = new int[10000];
        int pos = 0;


        n = sc.nextInt();
        k = sc.nextInt();

        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                divisor[pos] = i;
                pos++;
            }
        }

        System.out.println(divisor[--k]);
    }
}