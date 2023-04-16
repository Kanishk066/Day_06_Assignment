package com.bl.day_06;
import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int Num = sc.nextInt();
        int Reverse = 0;
        for (; Num != 0; Num /= 10) {
            int remainder = Num % 10;
            Reverse = Reverse * 10 + remainder;
        }
        System.out.println("The Reverse will be: "+Reverse);
    }
}
