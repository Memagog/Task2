package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double sum = 0;
        int n;
        System.out.println("1/n! * (1!+2!+3!+...+n!");
        Scanner s = new Scanner(System.in);
        System.out.print("Input N!:");
        n = s.nextInt();
        Main obj = new Main();
        for(int i = 1; i <= n; i++)
        {
            sum = sum + (double)i / (obj.factorial(i));
        }
        System.out.println("Sum of series:"+sum);
    }
    int factorial(int x)
    {
        int mul = 1;
        while(x > 0)
        {
            mul = mul * x;
            x--;
        }
        return mul;
    }
    }

