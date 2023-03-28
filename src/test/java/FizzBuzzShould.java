import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
/*
    --any number -> number
    --any number divisible by 3 but no by 5 and not contain 3 or 5-> Fizz (12)
    --any number contain 3 but no 5 and is not divisible by 3 or 5 -> Fizz (13)
    --any number divisible by 3 but no by 5 and contain 3 but no 5-> FizzFizz (3)
    any number divisible by 3 but no by 5 and contain 5 but no 3-> FizzBuzz (51)
    **any number divisible by 3 but no by 5 and contain 3 and contain 5-> FizzFizzBuzz (351)


    any number contain 5 but no 3 and is not divisible by 3 or 5 ->Buzz (56)
    any number divisible by 5 but no by 3 and not contain 3 or 5-> Buzz (40)
    any number divisible by 5 but no by 3 and contain 5 but no 3-> BuzzBuzz (5)
    **any number divisible by 5 but no by 3 and contain 3 but no 5-> BuzzFizz
    **any number divisible by 5 but no by 3 and contain 3 and 5-> BuzzFizzBuzz

    any number divisible by 3 and 5 but no contain 3 or 5 -> FizzBuzz (60)
    any number divisible by 3 and 5 and contain 3 but not 5-> FizzBuzzFizz (30)
    **any number divisible by 3 and 5 and contain 5 but no 3-> FizzBuzzBuzz
    **any number divisible by 3 and 5 and contain 3 and contain 5-> FizzBuzzFizzBuzz
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
        assertEquals("Fizz",result);
    }

    @Test
    void print_FizzFizz_when_number_is_dividibleby_3_but_not_by_5_and_contain_3_but_no_5() {
        int number = 3;
        String result = Main.checkNumber(number);
        assertEquals("FizzFizz", result);
    }
    //any number divisible by 3 but no by 5 and contain 5 but no 3-> FizzBuzz (51)

}
