import java.util.ArrayList;

public class Session15 {

    public static class Student {
        String name;
        int roll_number;

        Student(String name, int roll_number) {
            this.name = name;
            this.roll_number = roll_number;
        }

        public void displayInfo() {
            System.out.println("Name : " + name);
            System.out.println("Roll Number : " + roll_number);
        }
    }

    public static class Branch extends Student {
        String branch_name;

        Branch(String name, int roll_number, String branch_name) {
            super(name, roll_number);
            this.branch_name = branch_name;
        }

        @Override
        public void displayInfo() {
            super.displayInfo();
            System.out.println("Branch name : " + branch_name);

        }
    }

    public static class Semester extends Branch {

        int sem_number;
        String subject1;
        String subject2;

        Semester(String name, int roll_number, String branch_name, int sem_number, String subject1, String subject2) {
            super(name, roll_number,branch_name);
            this.sem_number = sem_number;
            this.subject1 = subject1;
            this.subject2 = subject2;

        }

        @Override
        public void displayInfo() {
            super.displayInfo();
            System.out.println("Semester : " + sem_number);
            System.out.println("Subject1 : " + subject1);
            System.out.println("Subject2 : " + subject2);
        }

    }

    public static void main(String[] args) {

        ArrayList<Semester> student_list = new ArrayList<>();


        student_list.add(new Semester("Omkar", 101, "Computer Eng", 2, "DSA", "Netwroks"));
        student_list.add(new Semester("Avi", 301, "Computer Eng with AI", 4, "AI", "ML"));
        student_list.add(new Semester("Varad", 401, "Computer Eng DS", 4, "DS", "DA"));

        System.out.println("Student list : " + student_list);

        for(Semester student : student_list) {
            System.out.println("\n Object : " + student);
            student.displayInfo();

        }
        //Semester student = new Semester("Omkar", 101, "Computer Eng", 2, "DSA", "Netwroks");
        //student1.displayInfo();
        //Semester student2 = new Semester("Avi", 301, "Computer Eng with AI", 4, "AI", "ML");
        //student2.displayInfo();


    }
}
