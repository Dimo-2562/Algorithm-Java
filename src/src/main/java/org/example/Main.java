package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = 0;
        int max = -999;

        for (int i = 0; i < 10; i++) {
            int minus = sc.nextInt();
            int plus = sc.nextInt();

            num += (plus - minus);
            if (max < num)
                max = num;

        }

        System.out.println(max);
    }
}