import java.util.Scanner;

public class CountOccurrences {
    public static void main(String[] args) {
        int[] arr = {2, 3, 2, 5, 2, 6};
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the target number: ");
        int target = scanner.nextInt();
        scanner.close();
        
        int count = 0;
        for (int num : arr) {
            if (num == target) {
                count++;
            }
        }
        
        System.out.println("The number " + target + " appears " + count + " times in the array.");
    }
}
