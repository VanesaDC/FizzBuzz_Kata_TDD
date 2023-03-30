import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
/*
    (1) ->1
    (6) ->Fizz
    (10)->Buzz
    (60)->FizzBuzz

    (13)->Fizz
    (52)->Buzz

    (5)->BuzzBuzz
    (3)->FizzFizz
    (35)->FizzBuzzBuzz
    (30)->FizzBuzzFizz
    (15)->FizzBuzzBuzz
*/

public class FizzBuzzShould {

    public String fizzBuzz(int number) {

        boolean is_divisible_by_3 = number % 3 == 0;
        if (is_divisible_by_3){
            return "Fizz";
        }
        return "1";
    }

    @Test
    void foo(){
        assertEquals(fizzBuzz(1),"1");
    }
    @Test
    void foo1(){
        assertEquals("Fizz",fizzBuzz(6));
    }

}
