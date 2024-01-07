public class DigitSum {
    public static void main(String[] args) {
        int input = 254;
        int sum = getDigitSum(input);
        System.out.println("Input: " + input);
        System.out.println("Sum is: " + sum);
    }

    public static int getDigitSum(int number) {
        int sum = 0;

        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }

        return sum;
    }
}
