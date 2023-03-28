public class Main {
    public static void main(String[] args) {

    }

    public static String checkNumber(int number) {

        boolean is_dividible_by_3 = number % 3 == 0;
        boolean contain_3= String.valueOf(number).contains("3");
        String message="";

        if (is_dividible_by_3) {
             message+="Fizz";
        }
        if (contain_3){
             message+="Fizz";
        }
        if(!is_dividible_by_3 &&!contain_3){
            message=String.valueOf(number);
        }
        return message;
    }

}
