import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceți valoarea pentru N: ");
        int N = scanner.nextInt();

        System.out.print("Șirul Fibonacci până la " + N + " este: ");
        printFibonacci(N);
    }

    public static void printFibonacci(int n) {
        int a = 0, b = 1, c;
        System.out.print(a + " " + b + " ");

        for (int i = 2; i < n; i++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}
