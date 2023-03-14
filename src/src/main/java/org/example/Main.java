package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean[] isPrime = new boolean[10001];
        for(int i = 0; i <= 10000; i++)
            isPrime[i] = true;
        isPrime[0] = isPrime[1] = false;

        for (int i = 2; i <= 100; i++) {
            if (isPrime[i])
                for (int j = i * i; j <= 10000; j += i)
                    isPrime[j] = false;
        }

        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();

        int sum = 0;
        int min = 0;
        boolean flag = true;

        for(int i = a; i <= b; i++){
            if(isPrime[i]){
                sum += i;
                if(flag){
                    min = i;
                    flag = false;
                }
            }
        }

        if(flag)
            System.out.println("-1");
        else{
            System.out.println(sum);
            System.out.println(min);
        }
    }
}
