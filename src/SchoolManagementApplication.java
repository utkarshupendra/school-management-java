import employee.Teacher;
import enums.ContractTenure;
import enums.Department;
import user.Student;

import java.util.HashMap;
import java.util.Map;

public class SchoolManagementApplication {
    public static void main(String[] args) {
        Student student1 = new Student("Himadri", "4", 987654321, "Kolkata", 11, 'A', 95);
        Student student2 = new Student("Himadri", "4", 987654321, "Kolkata", 11, 'A', 95);
        Teacher teacher = new Teacher("Arun", "1", 1234567890, "Hyderabad", 10000.0f, "B.Tech", ContractTenure.PERMANENT, "Associate Teacher", Department.ACADEMIC, "Maths");

        Map<String, Integer> map = new HashMap<>();
        Map<Student, Integer> studentIntegerMap = new HashMap<>();
        studentIntegerMap.put(student1, 23);
        studentIntegerMap.put(student2, 54);

        map.put("A", 3);
        map.get("A");
        map.remove("A");
        map.put("A", 6);
        map.put("B", 5);

        System.out.println(student1.getUserType());
        student1.evaluate(30);
        student1.evaluate(90);
    }
}
