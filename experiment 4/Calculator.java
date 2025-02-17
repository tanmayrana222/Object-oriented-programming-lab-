class Calculator {

    public int add(int a, int b) {
        System.out.println("Adding two integers:");
        return a + b;
    }

    public double add(double a, double b) {
        System.out.println("Adding two doubles:");
        return a + b;
    }

    public int add(int a, int b, int c) {
        System.out.println("Adding three integers:");
        return a + b + c;
    }

    public double add(int a, double b) {
        System.out.println("Adding an integer and a double:");
        return a + b;
    }

    public static void main(String[] args) {
        Calculator myCalculator = new Calculator();

        int sum1 = myCalculator.add(5, 10);
        System.out.println("Sum of two integers: " + sum1);

        System.out.println(); 

        double sum2 = myCalculator.add(3.14, 2.71);
        System.out.println("Sum of two doubles: " + sum2);

        System.out.println();

        int sum3 = myCalculator.add(2, 4, 6);
        System.out.println("Sum of three integers: " + sum3);

        System.out.println();
        double sum4 = myCalculator.add(5, 2.5);
        System.out.println("Sum of an integer and a double: " + sum4);


    }
}