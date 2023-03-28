public class Main {
    public static void main(String[] args) {

    }

    public static String checkNumber(int number) {
        boolean is_dividible_by_3 = number % 3 == 0;

        if (is_dividible_by_3) {
            return "Fizz";
        }
        return String.valueOf(number);
    }

}
