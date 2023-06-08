package com.epam.loops;

public class MultiplicationTable {

    public void printTable(int numberTableToPrint) {
        String result = "1 x " + numberTableToPrint + " = " + numberTableToPrint + "\n" +
                "2 x " + numberTableToPrint + " = " + 2 * numberTableToPrint + "\n" +
                "3 x " + numberTableToPrint + " = " + 3 * numberTableToPrint + "\n" +
                "4 x " + numberTableToPrint + " = " + 4 * numberTableToPrint + "\n" +
                "5 x " + numberTableToPrint + " = " + 5 * numberTableToPrint + "\n" +
                "6 x " + numberTableToPrint + " = " + 6 * numberTableToPrint + "\n" +
                "7 x " + numberTableToPrint + " = " + 7 * numberTableToPrint + "\n" +
                "8 x " + numberTableToPrint + " = " + 8 * numberTableToPrint + "\n" +
                "9 x " + numberTableToPrint + " = " + 9 * numberTableToPrint + "\n" +
                "10 x " + numberTableToPrint + " = " + 10 * numberTableToPrint;

        System.out.println(result);
    }

}
