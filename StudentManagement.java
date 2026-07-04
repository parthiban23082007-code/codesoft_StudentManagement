import java.util.ArrayList;

class StudentManagement {

    ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student s) {
        students.add(s);
        System.out.println("Student Added Successfully.");
    }

    public void removeStudent(int rollNo) {
        for (Student s : students) {
            if (s.rollNo == rollNo) {
                students.remove(s);
                System.out.println("Student Removed.");
                return;
            }
        }
        System.out.println("Student Not Found.");
    }

    public void searchStudent(int rollNo) {
        for (Student s : students) {
            if (s.rollNo == rollNo) {
                s.display();
                return;
            }
        }
        System.out.println("Student Not Found.");
    }

    public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No Students Available.");
            return;
        }

        for (Student s : students) {
            s.display();
            System.out.println("------------------");
        }
    }
}