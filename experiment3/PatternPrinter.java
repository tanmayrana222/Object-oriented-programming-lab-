public class PatternPrinter {
    public static void main(String[] args) {
        int[] patternSizes = {1, 3, 5, 7, 9};
        
        for (int i = 0; i < patternSizes.length; i++) {
            char symbol = (i % 2 == 0) ? '?' : '#';
            for (int j = 0; j < patternSizes[i]; j++) {
                System.out.print(symbol + " ");
            }
            System.out.println();
        }
    }
}
