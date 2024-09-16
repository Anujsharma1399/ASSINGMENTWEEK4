import java.util.ArrayList;

public class StudentManager {
    private ArrayList<String> students;

    public StudentManager() {
        students = new ArrayList<>();
    }

    public void addStudent(String studentName) {
        students.add(studentName);
    }

    public void removeStudent(String studentName) {
        students.remove(studentName);
    }

    public void displayStudents() {
        for (String student : students) {
            System.out.println(student);
        }
    }

    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        manager.addStudent("John Doe");
        manager.addStudent("Jane Doe");
        manager.addStudent("Bob Smith");
        manager.displayStudents();
        manager.removeStudent("Jane Doe");
        manager.displayStudents();
    }
}