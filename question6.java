import java.util.ArrayList;

class Student {
    String name;
    int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

public class question6 {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Amal", 85));
        students.add(new Student("Gihan", 45));
        students.add(new Student("Saman", 92));
        students.add(new Student("Lakmal", 70));
        students.add(new Student("Gayani", 88));


        int totalMarks = 0;
        for (Student s : students) {
            totalMarks += s.marks;
        }
        
    }
}
