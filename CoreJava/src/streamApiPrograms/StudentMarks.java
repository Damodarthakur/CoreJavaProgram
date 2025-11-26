package streamApiPrograms;

//java stream api to find student name and subject,
//fail in subject if marks less than 40 and more than 40 pass
import java.util.Arrays;
import java.util.List;

class Student {
    private String name;
    private String subject;
    private int marks;

    public Student(String name, String subject, int marks) {
        this.name = name;
        this.subject = subject;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    public int getMarks() {
        return marks;
    }
}

public class StudentMarks {
    public static void main(String[] args) {
        // Create a list of students
        List<Student> students = Arrays.asList(
                new Student("John", "Math", 70),
                new Student("Alice", "Science", 55),
                new Student("Bob", "English", 35),
                new Student("Mike", "History", 80)
        );

        // Use the Stream API to filter and process the students
        students.stream()
                .filter(student -> student.getMarks() < 40) // Filter failed students
                .forEach(student -> System.out.println(student.getName() + " failed in " + student.getSubject()));

        students.stream()
                .filter(student -> student.getMarks() >= 40) // Filter passed students
                .forEach(student -> System.out.println(student.getName() + " passed in " + student.getSubject()));
    }
}