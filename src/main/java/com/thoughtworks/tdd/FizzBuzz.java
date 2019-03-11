package com.thoughtworks.tdd;

public class FizzBuzz {

    public static String fizzBuzz(int number) {
        if(number%105 == 0) {
            return "FizzBuzzWhizz";
        } else if (number%35 == 0) {
            return "BuzzWhizz";
        } else if (number%21 == 0) {
            return "FizzWhizz";
        } else if (number%15 == 0) {
            return "FizzBuzz";
        } else if (number%7 == 0) {
            return "Whizz";
        } else if (number%5 == 0) {
            return "Buzz";
        } else if (number%3 == 0) {
            return "Fizz";
        }
        return String.valueOf(number);
    }
}
