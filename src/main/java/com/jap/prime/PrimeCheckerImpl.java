package com.jap.prime;

public class PrimeCheckerImpl {

    public boolean primeNumberCheck(int number) {
        // write the logic here to check is a number is prime or not
        PrimeChecker primeChecker = number1 -> {
            int count = 0;
            if (number == 0) {
                return false;
            } else {
                for (int i = 1; i <= number; i++) {
                    if (number % i == 0) {
                        count++;
                    }
                }
                return count == 2;
            }
        };
        return primeChecker.isPrimeNumber(number);
    }
}



