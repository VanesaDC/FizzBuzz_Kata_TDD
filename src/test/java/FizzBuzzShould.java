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



    @Test
    void foo(){
        assertEquals("2",FizzBuzz.fizzBuzz(2));
    }
    @Test
    void foo1(){
        assertEquals("Fizz", FizzBuzz.fizzBuzz(6));
    }

    @Test
    void foo3(){assertEquals("Buzz", FizzBuzz.fizzBuzz(10));
    }
    @Test
    void foo4(){assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(60));
    }
    @Test
    void foo5(){assertEquals("Fizz", FizzBuzz.fizzBuzz(13));
    }
    @Test
    void foo6(){assertEquals("Buzz", FizzBuzz.fizzBuzz(52));
    }
    @Test
    void foo7(){assertEquals("BuzzBuzz", FizzBuzz.fizzBuzz(5));}
    @Test
    void foo8(){assertEquals("FizzFizz", FizzBuzz.fizzBuzz(3));}
    @Test
    void foo9(){assertEquals("BuzzFizzBuzz", FizzBuzz.fizzBuzz(35));}
    @Test
    void foo10(){assertEquals("FizzBuzzFizz",fizzBuzz(30));}
    @Test
    void foo11(){assertEquals("FizzBuzzBuzz",fizzBuzz(15));}
}
