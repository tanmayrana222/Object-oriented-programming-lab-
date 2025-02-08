public class Calculator {
    public static void main(String[] args) {
        if (args.length != 3) {
           System.out.println("Usage: java Calculator <num1> <operator> <num2>");
            return;
        }

        int num1 = Integer.parseInt(args[0]);
        String operator = args[1];
        int num2 = Integer.parseInt(args[2]);

        switch (operator) {
            case "+":
                System.out.println("Sum of " + num1 + " and " + num2 + " is " + (num1 + num2));
                break;
            case "-":
                System.out.println("Difference of " + num1 + " and " + num2 + " is " + (num1 - num2));
                break;
            case "*":
                System.out.println("Product of " + num1 + " and " + num2 + " is " + (num1 * num2));
                break;
            default:
                System.out.println("Invalid operator! Please use +, -, or *.");
        }
    }
}
