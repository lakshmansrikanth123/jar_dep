package com.example.numberanalyzer.service;

import org.springframework.stereotype.Service;

@Service
public class NumberService {

    public boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0) return false;
        return true;
    }

    public long factorial(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++)
            result *= i;
        return result;
    }

    public boolean isArmstrong(int n) {
        int original = n, sum = 0;
        int digits = String.valueOf(n).length();

        while (n > 0) {
            int digit = n % 10;
            sum += Math.pow(digit, digits);
            n /= 10;
        }
        return sum == original;
    }

    public int fibonacci(int n) {
        if (n <= 1) return n;
        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }
}
