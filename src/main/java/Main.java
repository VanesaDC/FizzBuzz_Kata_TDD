public class Main {
    public static void main(String[] args) {

    }

    public static String checkNumber(int number) {

        boolean is_divisible_by_3 = number % 3 == 0;
        boolean is_divisible_by_5 = number % 5 == 0;
        boolean contain_3= String.valueOf(number).contains("3");
        boolean contain_5= String.valueOf(number).contains("5");

        String message="";

        if (is_divisible_by_3) {
            message+="Fizz";
        }
        if (is_divisible_by_5){
            message+="Buzz";
        }
        if (contain_3){
            message+="Fizz";
        }
        if (contain_5){
            message+="Buzz";
        }
        if(!is_divisible_by_3 && !contain_3 && !is_divisible_by_5 && !contain_5){
            message=String.valueOf(number);
        }
        return message;
    }

}
