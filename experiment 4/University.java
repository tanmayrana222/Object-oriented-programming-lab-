class University {
    public static String universityName = "UPES";

    public String studentName; 

    public University(String studentName) {
        this.studentName = studentName;
    }

    public static void displayUniversityName() {
        System.out.println("University Name: " + universityName);
    }

    public void displayStudentName() {
        System.out.println("Student Name: " + studentName);
    }

    public static void main(String[] args) {
        System.out.println("University: " + University.universityName);
        University.displayUniversityName(); 
        System.out.println();

        University student1 = new University("TANMAY");
        University student2 = new University("GARVIT");
        University student3 = new University("SAAGAR");

        student1.displayStudentName();
        student2.displayStudentName();
        student3.displayStudentName();

        System.out.println();
        System.out.println("Student 1 University: " + student1.universityName);
        System.out.println("Student 2 University: " + student2.universityName);
        System.out.println("Student 3 University: " + student3.universityName);

        University.universityName = "UPES ";  
        System.out.println("\nUniversity name changed...");

        System.out.println("Student 1 University: " + student1.universityName);
        System.out.println("Student 2 University: " + student2.universityName);
        System.out.println("Student 3 University: " + student3.universityName);
        University.displayUniversityName(); 
    }
}