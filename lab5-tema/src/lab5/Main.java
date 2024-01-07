package lab5;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Employee> employees = new ArrayList<>();

        System.out.print("Enter Number of Employees: N=");
        int N = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        for(int i = 1; i <= N; i++) {
            // Prompt the user to enter Employee details
            System.out.println("Employee " + i);
            System.out.print("Enter Employee Name: ");
            String name = scanner.nextLine();

            System.out.print("Enter Employee Email: ");
            String email = scanner.nextLine();

            System.out.print("Enter Hourly Rate: ");
            double hourRate = scanner.nextDouble();

            System.out.print("Enter Working Capacity (hours per day): ");
            int capacity = scanner.nextInt();

            System.out.print("Enter Free Days: ");
            int freeDays = scanner.nextInt();
            scanner.nextLine();

            Employee employee = new Employee(name, email, hourRate, capacity, freeDays);
            employees.add(employee);
        }

        for (Employee employee : employees) {
            int dailyIncome = employee.calculateDailyIncome();
            System.out.println("Daily Income for " + employee.getName() + ": $" + dailyIncome);

            employee.printMonthlyIncome();
        }

        scanner.close();
    }
}
