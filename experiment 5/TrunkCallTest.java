import java.util.Scanner;
abstract class TrunkCall {
    protected int duration;

    public TrunkCall(int duration) {
        this.duration = duration;
    }
    public abstract double calculateCharge();
}
class OrdinaryCall extends TrunkCall {
    public OrdinaryCall(int duration) {
        super(duration);
    }

    @Override
    public double calculateCharge() {
        return duration * 2.0;
    }
}
class UrgentCall extends TrunkCall {
    public UrgentCall(int duration) {
        super(duration);
    }

    @Override
    public double calculateCharge() {
        return duration * 4.0;
    }
}
class LightningCall extends TrunkCall {
    public LightningCall(int duration) {
        super(duration);
    }

    @Override
    public double calculateCharge() {
        return duration * 6.0;
    }
}

public class TrunkCallTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter call duration (in minutes): ");
        int duration = scanner.nextInt();

        System.out.println("Select Call Type:");
        System.out.println("1. Ordinary");
        System.out.println("2. Urgent");
        System.out.println("3. Lightning");
        System.out.print("Enter choice (1-3): ");
        int choice = scanner.nextInt();

        TrunkCall call;
        switch (choice) {
            case 1:
                call = new OrdinaryCall(duration);
                break;
            case 2:
                call = new UrgentCall(duration);
                break;  
            case 3:
                call = new LightningCall(duration);
                break;
            default:
                System.out.println("Invalid choice!");
                scanner.close();
                return;
        }

        System.out.println("Total Charge: ₹" + call.calculateCharge());
        scanner.close();
    }
}
