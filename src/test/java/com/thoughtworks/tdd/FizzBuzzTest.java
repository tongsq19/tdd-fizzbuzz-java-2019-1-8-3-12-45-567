package com.thoughtworks.tdd;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;



public class FizzBuzzTest {

    @Test
    public void should_return_orignal_number_when_not_mulitply_of_three_or_five_or_seven() {
        int number = 1;
        String actual = FizzBuzz.fizzBuzz(number);
        assertThat(actual, is("1"));
    }

    @Test
    public void should_return_Fizz_when_multiply_of_three() {
        int number = 3;
        String actual = FizzBuzz.fizzBuzz(number);
        assertThat(actual, is("Fizz"));
    }

    @Test
    public void should_return_Buzz_when_multiply_of_five() {
        int number = 5;
        String actual = FizzBuzz.fizzBuzz(number);
        assertThat(actual, is("Buzz"));
    }

    @Test
    public void should_return_Whizz_when_multiply_of_seven() {
        int number = 7;
        String actual = FizzBuzz.fizzBuzz(number);
        assertThat(actual, is("Whizz"));
    }

    @Test
    public void should_return_FizzBuzz_when_multiply_of_both_three_and_five() {
        int number = 15;
        String actual = FizzBuzz.fizzBuzz(number);
        assertThat(actual, is("FizzBuzz"));
    }

    @Test
    public void should_return_FizzWhizz_when_multiply_of_both_three_and_seven() {
        int number = 21;
        String actual = FizzBuzz.fizzBuzz(number);
        assertThat(actual, is("FizzWhizz"));
    }

    @Test
    public void should_return_BuzzWhizz_when_multiply_of_both_five_and_seven() {
        int number = 35;
        String actual = FizzBuzz.fizzBuzz(number);
        assertThat(actual, is("BuzzWhizz"));
    }

    @Test
    public void should_return_FizzBuzzWhizz_when_multiply_of_three_five_and_seven() {
        int number = 105;
        String actual = FizzBuzz.fizzBuzz(number);
        assertThat(actual, is("FizzBuzzWhizz"));
    }
}
