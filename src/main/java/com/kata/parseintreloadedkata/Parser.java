package com.kata.parseintreloadedkata;

public class Parser {

    public static int parseInt(String numStr) {
        if (numStr.equals("one million")) {
            return 1_000_000;
        }
        String[] parts = numStr.replace(" and ", " ").split("(\\s|-)");
        int sum = 0;
        int partSum = 0;
        for(String part : parts) {
            switch (part) {
                case "one" -> partSum += 1;
                case "two" -> partSum += 2;
                case "three" -> partSum += 3;
                case "four" -> partSum += 4;
                case "five" -> partSum += 5;
                case "six" -> partSum += 6;
                case "seven" -> partSum += 7;
                case "eight" -> partSum += 8;
                case "nine" -> partSum += 9;
                case "ten" -> partSum += 10;
                case "eleven" -> partSum += 11;
                case "twelve" -> partSum += 12;
                case "thirteen" -> partSum += 13;
                case "fourteen" -> partSum += 14;
                case "fifteen" -> partSum += 15;
                case "sixteen" -> partSum += 16;
                case "seventeen" -> partSum += 17;
                case "eighteen" -> partSum += 18;
                case "nineteen" -> partSum += 19;
                case "twenty" -> partSum += 20;
                case "thirty" -> partSum += 30;
                case "forty" -> partSum += 40;
                case "fifty" -> partSum += 50;
                case "sixty" -> partSum += 60;
                case "seventy" -> partSum += 70;
                case "eighty" -> partSum += 80;
                case "ninety" -> partSum += 90;
                case "hundred" -> partSum *= 100;
                case "thousand" -> partSum *= 1000;
            }
            if (part.equals("thousand")) {
                sum += partSum;
                partSum = 0;
            }
        }
        return sum+partSum;
    }
}