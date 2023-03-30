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
        boolean is_divisible_by_5 = number % 5 == 0;
        if (is_divisible_by_3 && is_divisible_by_5){
            return "FizzBuzz";
        }

        boolean contains_3 = String.valueOf(number).contains("3");
        if (is_divisible_by_3 || contains_3){
            return "Fizz";
        }

        if (is_divisible_by_5 ||String.valueOf(number).contains("5") ){
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
    @Test
    void foo5(){assertEquals("Fizz",fizzBuzz(13));
    }
    @Test
    void foo6(){assertEquals("Buzz",fizzBuzz(52));
    }
    @Test
    void foo7(){assertEquals("BuzzBuzz",fizzBuzz(5));}

}
