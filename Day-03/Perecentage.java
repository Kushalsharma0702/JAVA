import java.util.Scanner;

public class Percentage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create Scanner object

        System.out.println("This Program is For calculating % of students:");
        System.out.println("Enter first subject no.: ");
        float a = scanner.nextFloat(); // Read user input
        System.out.println("Enter second subject marks");
        Float b = scanner.nextFloat();
        System.out.println("The above marks you entered are from");
        float total_marks = scanner.nextFloat();
        System.out.println("of how many subject percentage you want to calculate");
        float no_ofsubejcts= scanner.nextFloat();
        float sum_of_marks = a+b;
        float calculation_marks= total_marks*no_ofsubejcts;
        float Percentage_calc = (sum_of_marks/calculation_marks)*100;
        System.out.printf("The percentage is: %.2f%%\n", Percentage_calc); //format specifier is used here %.2f%%
        scanner.close(); // Close the scanner
    }
}
