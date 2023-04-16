package com.bl.day_06;
import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit: ");
        int limit = sc.nextInt();
        int term1 = 0;
        int term2 = 1;
        for (int i = 2; i < limit; i++) {
            int NextTerm = term1 + term2;
            term1 = term2;
            term2 = NextTerm;
            System.out.println(" "+NextTerm);
        }
        System.out.println();
    }
}
