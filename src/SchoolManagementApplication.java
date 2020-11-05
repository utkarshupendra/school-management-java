import employee.Teacher;
import enums.ContractTenure;
import enums.Department;
import user.Student;

public class SchoolManagementApplication {
    public static void main(String[] args) {
        Student student = new Student("Himadri", "4", 987654321, "Kolkata", 11, 'A', 95);
        Teacher teacher = new Teacher("Arun", "1", 1234567890, "Hyderabad", 10000.0f, "B.Tech", ContractTenure.PERMANENT, "Associate Teacher", Department.ACADEMIC, "Maths");

        System.out.println(student.getUserType());
        student.evaluate(30);
        student.evaluate(90);
    }
}
