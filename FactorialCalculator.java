import java.util.Scanner;

public class FactorialCalculator {

    public static void main(String[] args) {
        int num = getNonNegativeInteger(); 
        long factorial = calculateFactorial(num);
        System.out.println("The factorial of " + num + " is: " + factorial);
    }

    public static int getNonNegativeInteger() {
        Scanner sc = new Scanner(System.in);
        int num;
        while (true) {
            System.out.print("Enter a non-negative integer: ");
            num = sc.nextInt();
            if (num >= 0) {
                break;
            } else {
                System.out.println("Please enter a non-negative integer.");
            }
        }
        return num;
    }

    public static long calculateFactorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i; 
        }
        return result;
    }
}
