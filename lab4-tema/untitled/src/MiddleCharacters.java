public class MiddleCharacters {
    public static void main(String[] args) {
        String input = "masina";
        String middle = getMiddleChars(input);
        System.out.println("Input: " + input);
        System.out.println("Expected Output: " + middle);
    }

    public static String getMiddleChars(String input) {
        int length = input.length();
        int middleIndex = length / 2;

        if (length % 2 == 0) {
            return input.substring(middleIndex - 1, middleIndex + 1);
        } else {
            return input.substring(middleIndex, middleIndex + 1);
        }
    }
}
