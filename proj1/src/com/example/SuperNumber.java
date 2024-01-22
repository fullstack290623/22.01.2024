package com.example;

public class SuperNumber {

    private final int number;
    private static int maxNumber = Integer.MIN_VALUE;
    private static int minNumber = Integer.MAX_VALUE;

    public static int getMaxNumber() {
        return maxNumber;
    }

    public static int getMinNumber() {
        return minNumber;
    }

    public int getNumber() {
        return number;
    }

    private static void setMaxNumber(int number) {
        if (number > maxNumber) {
            maxNumber = number;
        }
    }

    private static void setMinNumber(int number) {
        if (number < minNumber) {
            minNumber = number;
        }
    }

    public SuperNumber(int number) {
        this.number = number;
        setMaxNumber(this.number);
        setMinNumber(this.number);
    }

    @Override
    public String toString() {
        return "SuperNumber{" +
                "number=" + number +
                '}';
    }
}
