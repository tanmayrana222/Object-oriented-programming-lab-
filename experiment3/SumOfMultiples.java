public class SumOfMultiples {
    public static void main(String[] args) {
        int start = 10, end = 950;
        int num1 = 6, num2 = 9;
        
        int lcm = (num1 * num2) / gcd(num1, num2); // Least Common Multiple of num1 and num2
        int sum = 0;
        
        for (int i = start; i <= end; i++) {
            if (i % lcm == 0) {
                sum += i;
            }
        }   
        System.out.println("Sum of numbers divisible by both 6 and 9: " + sum);
    }
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
