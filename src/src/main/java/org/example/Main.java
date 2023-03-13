package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] hobit = new int[9];
        int sum = 0;
        boolean flag = false;

        for (int i = 0; i < 9; i++) {
            hobit[i] = sc.nextInt();
        }
        for (int i = 0; i < hobit.length; i++) {
            sum += hobit[i];
        }

        for (int i = 0; i < 9; i++) {
            if (flag == true)
                break;
            for (int j = i + 1; j < 9; j++) {
                if ((sum - hobit[i] - hobit[j]) == 100) {
                    hobit[i] = 999;
                    hobit[j] = 999;
                    flag = true;
                    break;
                }
            }
        }

        Arrays.sort(hobit);
        for (int i = 0; i < 7; i++) {
            System.out.println(hobit[i]);
        }

    }
}
