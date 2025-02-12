public class student {
    private String name;
    private int age;

    public student() {
        this.name = "Unknown";
        this.age = 0;
        System.out.println("Default constructor called.");
    }
    public student(String studentName, int studentAge) {
        this.name = studentName;
        this.age = studentAge;
        System.out.println("Parameterized constructor called.");
    }
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    public static void main(String[] args)
     {student student1 = new student("Tanmay", 20); 
        System.out.println("Details of student1:");
        student1.displayDetails();
        System.out.println();

        student student2 = new student("Alice", 20);
        System.out.println("Details of student2:");
        student2.displayDetails();
        System.out.println();

        student student3 = new student("Bob", 22);
        System.out.println("Details of student3:");
        student3.displayDetails();
        System.out.println();
    }
}