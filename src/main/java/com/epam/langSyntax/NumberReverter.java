package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        int input = number, result = 0;
        while (input != 0) {
            int remainder = input % 10;
            result = result * 10 + remainder;
            input = input / 10;
        }
        System.out.println(result);
    }

}
