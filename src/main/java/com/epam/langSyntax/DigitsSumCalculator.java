package com.epam.langSyntax;

public class DigitsSumCalculator {

    public void calculateSum(int number) {
        int input = number, sum = 0;
        while (input != 0) {
            int digit = input % 10;
            sum = sum + digit;
            input = input / 10;
        }
        System.out.println(sum);
    }

}
