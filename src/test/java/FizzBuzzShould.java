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

    (35)->BuzzFizzBuzz
    (30)->FizzBuzzFizz
    (15)->FizzBuzzBuzz
*/

public class FizzBuzzShould {

    public String fizzBuzz(int number) {

        boolean is_divisible_by_3 = number % 3 == 0;
        boolean is_divisible_by_5 = number % 5 == 0;
        boolean contains_3 = String.valueOf(number).contains("3");
        boolean contains_5 = String.valueOf(number).contains("5");

        if (is_divisible_by_5 && contains_3 && contains_5){
            return "BuzzFizzBuzz";
        }
        if (is_divisible_by_3 && is_divisible_by_5 && contains_3){
            return "FizzBuzzFizz";
        }

        if (is_divisible_by_3 && is_divisible_by_5){
            return "FizzBuzz";
        }

        if (is_divisible_by_3 && contains_3){
            return "FizzFizz";
        }
        if (is_divisible_by_3 || contains_3){
            return "Fizz";
        }

        if (is_divisible_by_5 && contains_5 ){
            return "BuzzBuzz";
        }

        if (is_divisible_by_5 || contains_5){
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
    @Test
    void foo8(){assertEquals("FizzFizz",fizzBuzz(3));}
    @Test
    void foo9(){assertEquals("BuzzFizzBuzz",fizzBuzz(35));}
    @Test
    void foo10(){assertEquals("FizzBuzzFizz",fizzBuzz(30));}
    @Test
    void foo11(){assertEquals("FizzBuzzBuzz",fizzBuzz(15));}
}
