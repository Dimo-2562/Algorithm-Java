package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();

        for(int i = 0; i < test; i++){
            int n = sc.nextInt();
            int[] binary = new int[10000];

            int k = 0;

            while(n != 0){
                binary[k++] = n % 2;
                n = n / 2;
            }

            for(int j = 0; j <= k; j++){
                if(binary[j] == 1)
                    System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}