import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentManagement sms = new StudentManagement();

        while (true) {

            System.out.println("\n===== Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Search Student");
            System.out.println("4. Display Students");
            System.out.println("5. Exit");
            System.out.print("Enter Choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Roll No: ");
                    int roll = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Grade: ");
                    String grade = sc.nextLine();

                    Student s = new Student(roll, name, grade);
                    sms.addStudent(s);
                    break;

                case 2:
                    System.out.print("Enter Roll No: ");
                    sms.removeStudent(sc.nextInt());
                    break;

                case 3:
                    System.out.print("Enter Roll No: ");
                    sms.searchStudent(sc.nextInt());
                    break;

                case 4:
                    sms.displayStudents();
                    break;

                case 5:
                    System.out.println("Thank You");
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}