import java.util.Scanner;

public class evenorodd {
    public static void main(String args[ ]) {
        try (Scanner Scanner = new Scanner(System.in)) {
            System.out.print("Enter a number:");
            int number = Scanner.nextInt();
            
            if (number % 2 == 0) {
                System.out.println(number + " is even.");
            }
            
            else {
                System.out.println(number + " is odd.");
            }
        }
    }
}
