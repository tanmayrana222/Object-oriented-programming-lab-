import java.util.Scanner;

public class SwapStrings {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the first string: ");
            String string1 = scanner.nextLine();
            
            System.out.print("Enter the second string: ");
            String string2 = scanner.nextLine();
            
            String temp = string1;
            string1 = string2;
            string2 = temp;
            
            System.out.println("After swapping:");
            System.out.println("First string: " + string1);
            System.out.println("Second string: " + string2);
        }
    }
}
