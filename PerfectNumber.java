package com.bl.day_06;
import  java.util.Scanner;
public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Positive Number: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
            if (sum == n) {
                System.out.println("Number is a perfect number");
            } else {
                System.out.println("Number is not a perfect number");
            }
        }
    }

