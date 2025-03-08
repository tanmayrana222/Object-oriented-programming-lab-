abstract class Worker {
    protected String name;
    protected double salaryRate;

    public Worker(String name, double salaryRate) {
        this.name = name;
        this.salaryRate = salaryRate;
    }

    public abstract double computePay(int hours);
}
class DailyWorker extends Worker {
    public DailyWorker(String name, double salaryRate) {
        super(name, salaryRate);
    }

    @Override
    public double computePay(int hours) {
        int daysWorked = hours / 8; 
        return daysWorked * salaryRate;
    }
}

class SalariedWorker extends Worker {
    public SalariedWorker(String name, double salaryRate) {
        super(name, salaryRate);
    }

    @Override
    public double computePay(int hours) {
        return 40 * salaryRate; 
    }
}

public class WorkerTest {
    public static void main(String[] args) {
        Worker dailyWorker = new DailyWorker("Tanmay Rana", 100);
        Worker salariedWorker = new SalariedWorker("Garvit choudhary", 50);

        System.out.println(dailyWorker.name + "'s Weekly Pay: Rs" + dailyWorker.computePay(48));
        System.out.println(salariedWorker.name + "'s Weekly Pay: Rs" + salariedWorker.computePay(50));
    }
}
