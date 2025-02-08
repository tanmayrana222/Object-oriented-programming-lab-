import java.util.Scanner;
public class FindGreatest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third integer: ");
        int num3 = scanner.nextInt();

        int greatest;

        if (num1 >= num2) {
            if (num1 >= num3) {
                greatest = num1;
            } else {
                greatest = num3;
            }
        } else {
            if (num2 >= num3) {
                greatest = num2;
            } else {
                greatest = num3;
            }
        }

        System.out.println("The greatest number is: " + greatest);

        scanner.close();
    }
}