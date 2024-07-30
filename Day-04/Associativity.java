import java.util.Scanner;

public class Associativity {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number:");
            int k = sc.nextInt();
            float a = k * 4 / 7;
            System.out.println("Here is the output:");
            System.out.println(a);
        }
    }
}
