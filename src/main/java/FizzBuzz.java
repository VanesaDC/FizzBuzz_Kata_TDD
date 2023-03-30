public class FizzBuzz {
    public static String fizzBuzz(int number) {

        boolean is_divisible_by_3 = number % 3 == 0;
        boolean is_divisible_by_5 = number % 5 == 0;
        boolean contains_3 = String.valueOf(number).contains("3");
        boolean contains_5 = String.valueOf(number).contains("5");

        if (is_divisible_by_3 && is_divisible_by_5 && contains_3){
            return "FizzBuzzFizz";
        }

        if (is_divisible_by_3 && is_divisible_by_5 && contains_5){
            return "FizzBuzzBuzz";

        }
        if (is_divisible_by_5 && contains_3 && contains_5){
            return "BuzzFizzBuzz";
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

        return String.valueOf(number);
    }
}
