package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();

        int[] num = new int[1002];
        int count = 1;

        for (int i = 1; i <= 1000; i++) {
            for (int j = 0; j < i; j++) {
                if (count == 1001)
                    break;
                num[count++] = i;
            }
            if (count == 1001)
                break;
        }

        int sum = 0;
        for (int i = a; i <= b; i++) {
            sum += num[i];
        }

        System.out.println(sum);
    }
}
