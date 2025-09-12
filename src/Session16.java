import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Session16 {

    public static class Student {
        private String name;
        private int rollNumber;

        public Student(String name, int rollNumber) {
            this.name = name;
            this.rollNumber = rollNumber;
        }

        public String getName() { return name; }
        public void setName(String name) { this.name = name; }

        public int getRollNumber() { return rollNumber; }
        public void setRollNumber(int rollNumber) { this.rollNumber = rollNumber; }

        @Override
        public String toString() {
            return "Name: " + name + ", Roll Number: " + rollNumber;
        }
    }

    public static class Branch extends Student {
        private String branchName;

        public Branch(String name, int rollNumber, String branchName) {
            super(name, rollNumber);
            this.branchName = branchName;
        }

        public String getBranchName() { return branchName; }
        public void setBranchName(String branchName) { this.branchName = branchName; }

        @Override
        public String toString() {
            return super.toString() + ", Branch: " + branchName;
        }
    }

    public static class Semester extends Branch {
        private int semNumber;
        private String subject1;
        private String subject2;

        public Semester(String name, int rollNumber, String branchName,
                        int semNumber, String subject1, String subject2) {
            super(name, rollNumber, branchName);
            this.semNumber = semNumber;
            this.subject1 = subject1;
            this.subject2 = subject2;
        }

        public int getSemNumber() { return semNumber; }
        public void setSemNumber(int semNumber) { this.semNumber = semNumber; }

        public String getSubject1() { return subject1; }
        public void setSubject1(String subject1) { this.subject1 = subject1; }

        public String getSubject2() { return subject2; }
        public void setSubject2(String subject2) { this.subject2 = subject2; }

        @Override
        public String toString() {
            return super.toString()
                    + ", Semester: " + semNumber
                    + ", Subject1: " + subject1
                    + ", Subject2: " + subject2;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Semester> students = new ArrayList<>();

        int choice;
        do {
            System.out.println("\n=== Student Management Menu ===");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Update Student by Roll Number");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1: // Add student
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Roll Number: ");
                    int rollNumber = sc.nextInt();
                    sc.nextLine(); // consume newline
                    System.out.print("Enter Branch Name: ");
                    String branch = sc.nextLine();
                    System.out.print("Enter Semester Number: ");
                    int sem = sc.nextInt();
                    sc.nextLine(); // consume newline
                    System.out.print("Enter Subject1: ");
                    String sub1 = sc.nextLine();
                    System.out.print("Enter Subject2: ");
                    String sub2 = sc.nextLine();

                    Semester student = new Semester(name, rollNumber, branch, sem, sub1, sub2);
                    students.add(student);
                    System.out.println("✅ Student added successfully!");
                    break;

                case 2: // Display
                    if (students.isEmpty()) {
                        System.out.println("No students available.");
                    } else {
                        System.out.println("\n--- Student List ---");
                        for (Semester s : students) {
                            System.out.println(s);
                        }
                    }
                    break;

                case 3: // Update
                    System.out.print("Enter Roll Number to Update: ");
                    int searchRoll = sc.nextInt();
                    sc.nextLine(); // consume newline
                    boolean found = false;
                    for (Semester s : students) {
                        if (s.getRollNumber() == searchRoll) {
                            System.out.println("Student found: " + s);
                            System.out.print("Enter new Subject1: ");
                            s.setSubject1(sc.nextLine());
                            System.out.print("Enter new Subject2: ");
                            s.setSubject2(sc.nextLine());
                            System.out.println("✅ Student updated successfully!");
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("❌ Student with Roll Number " + searchRoll + " not found.");
                    }
                    break;

                case 4: // Exit
                    System.out.println("Exiting program... Goodbye!");
                    break;

                default:
                    System.out.println("❌ Invalid choice. Please try again.");
            }
        } while (choice != 4);

        sc.close();
    }
}
