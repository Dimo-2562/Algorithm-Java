package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t;
        t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int[] num = new int[10];
            for (int j = 0; j < 10; j++) {
                num[j] = sc.nextInt();
            }

            Arrays.sort(num);

            System.out.println(num[7]);
        }
    }
}
