package com.epam.conditions;

import java.time.YearMonth;

public class DaysInMonth {

    public void printDays(int year, int month) {
        if (year < 0 || month > 12 || month < 1) {
            System.out.println("invalid date");
            return;
        }
        YearMonth yearMonth = YearMonth.of(year, month);
        System.out.println(yearMonth.lengthOfMonth());
    }

}
