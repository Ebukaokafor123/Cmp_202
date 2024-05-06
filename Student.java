package OOP;

public class Student extends User {
    String matric_no = "bhu/23/04/09/0072";
    String admission_no = "1087453673";
    String registerCourse() {
        if (matric_no.equals("") || admission_no.equals("")) {
            return "You cannot register your courses at this moment";
        } else {
            return "You have registered for all courses";
        }
    }
    String checkResults() {
        if (matric_no.equals("") || admission_no.equals("")) {
            return "Cannot check your result.";
        } else {
            return "You got 8As, 2Cs and 1D";
        }
    }
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Ebuka Okafor";
        student.password = "Ebuka23";
        System.out.println(student.register());
        System.out.println(student.registerCourse());
        System.out.println(student.checkResults());
    }
}
