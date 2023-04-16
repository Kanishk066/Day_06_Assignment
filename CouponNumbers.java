package com.bl.day_06;

import java.util.Random;

public class CouponNumbers {
    public static int[] generateCouponNumbers(int n) {
        int[] couponNumbers = new int[n];
        for (int i = 0; i < n; i++) {
            couponNumbers[i] = i + 1;
        }
        return couponNumbers;
    }
    public static int generateRandomNumbers(int max) {
        Random ran = new Random();
        return ran.nextInt(max);
    }
    public static int generateDistinctCoupons(int[] couponNumbers) {
        boolean[] generatedCouponNumbers = new boolean[couponNumbers.length];
        int randomNumberCount = 0;
        int distinctCouponsCount = 0;
        while (distinctCouponsCount < couponNumbers.length) {
            int randomNumbers = generateRandomNumbers(couponNumbers.length);
            randomNumberCount++;
            if (!generatedCouponNumbers[randomNumbers]) {
                generatedCouponNumbers[randomNumbers] = true;
                distinctCouponsCount++;
            }
        }
        return randomNumberCount;
    }

    public static void main(String[] args) {
        int[] couponNumbers = generateCouponNumbers(10);
        int totalRandomNumbers = generateDistinctCoupons(couponNumbers);
        System.out.println("Total random numbers generated to obtain all distinct coupons: " + totalRandomNumbers);
    }
}


