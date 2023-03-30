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
        boolean is_divisible_by_5 = number % 5 == 0;
        if (is_divisible_by_5){
            return "Buzz";
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

    @Test
    void foo3(){assertEquals("Buzz",fizzBuzz(10));
    }
    @Test
    void foo4(){assertEquals("FizzBuzz",fizzBuzz(60));
    }

}
