public class PrimeNumbers {
    public static void main(String[] args) {
        int count = 0;
        
        System.out.println("Prime numbers between 1 and 1000:");
        for (int num = 2; num <= 1000; num++) {
            if (isPrime(num)) {
                System.out.print(num + " ");
                count++;
            }
        }
        System.out.println("\nTotal number of prime numbers: " + count);
    }
    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}