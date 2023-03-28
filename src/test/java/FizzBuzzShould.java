import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
/*
    any number -> number
    any number divisible by 3-> Fizz
    any number divisible by 3 and contain 3-> FizzFizz
    any number divisible by 3 and contain 5-> FizzBuzz
    any number divisible by 3 and contain 3 and contain 5-> FizzFizzBuzz

    any number divisible by 5-> Buzz
    any number divisible by 5 and contain 5-> BuzzBuzz
    any number divisible by 5 and contain 3-> BuzzFizz
    any number divisible by 5 and contain 3 and 5-> BuzzFizzBuzz

    any number divisible by 3 and 5 -> FizzBuzz
    any number divisible by 3 and 5 and contain 3-> FizzBuzzFizz
    any number divisible by 3 and 5 and contain 5-> FizzBuzzBuzz
    any number divisible by 3 and 5 and contain 3 and contain 5-> FizzBuzzFizzBuzz
     */
public class FizzBuzzShould {


    @Test
    void print_same_number_when_it_is_not_divisible_by_3_and_5_and_no_contain_3_or_5(){
        int number=2;
        String result= Main.checkNumber(number);
        assertEquals(String.valueOf(number),result);
    }

    @Test
    void print_Fizz_if_number_is_divisible_by_3(){
        int number=3;
        String result= Main.checkNumber(number);
        assertEquals("Fizz",result);
    }

    @Test
    void print_Fizz_if_number_is_divisible_by_3_and_contain_3(){
        int number=30;
        String result= Main.checkNumber(number);
        assertEquals("FizzFizz",result);
    }

}
