class Bankaccount {
    private double balance; 

    public Bankaccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    protected void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient funds or invalid withdrawal amount.");
        }
    }

    void checkBalance() { 
        System.out.println("Current balance: " + balance);
    }

    public static void main(String[] args) {
        Bankaccount myAccount = new Bankaccount(1000);

        myAccount.deposit(500);      
        myAccount.withdraw(200);     
        myAccount.checkBalance();   

        System.out.println("\n--- Accessing from outside the class (main method): ---");
        myAccount.deposit(100); 
        myAccount.checkBalance(); 
    }
}


class AccountTester {
    public static void main(String[] args) {
        Bankaccount anotherAccount = new Bankaccount(500);
        anotherAccount.deposit(200); 
        anotherAccount.withdraw(100); 
        anotherAccount.checkBalance(); 
    }
}
