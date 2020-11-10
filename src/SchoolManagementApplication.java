import db.PostgresManager;
import employee.Teacher;
import enums.ContractTenure;
import enums.Department;
import user.Student;

import java.sql.Connection;
import java.sql.Statement;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class SchoolManagementApplication {
    public static void main(String[] args) {
        Map<String, Integer> marks = new HashMap<>();
        marks.put("Maths", 98);
        marks.put("Phy", 90);
        Student student1 = new Student("Himadri", "4", 987654321, "Kolkata", 11, 'A', 95, marks);
        Student student2 = new Student("Himadri", "4", 987654321, "Kolkata", 11, 'A', 95, marks);
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
        map.put("C", 1);

        Stack<String> stringStack = new Stack<>();
        stringStack.push("A");
        stringStack.push("B");

        stringStack.pop();
        stringStack.peek();
        stringStack.elements();

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("A");
        linkedList.add("B");
        linkedList.remove();
        //linkedList.remove(1);
        //linkedList.get(1);



        Queue<String> queue = new LinkedList<>();
        queue.add("A");
        queue.add("B");
        String s = queue.peek();
        System.out.println(s);
        s = queue.poll();
        System.out.println(s);

        //queue.remove("A")




        for (int i = 0; i < map.size(); i++) {
            //list.get(i)
        }
        List<String> strings = new ArrayList<>();
        //
        //

        for (Map.Entry entry : map.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
            System.out.println();
        }


        Set<Student> studentSet = new HashSet<>();
        studentSet.add(student1);
        studentSet.add(student2);
        studentSet.contains(student1);

        List<Student> studentList = new ArrayList<>();
        if (!(studentList.contains(student1))) {
            studentList.add(student1);
            studentList.contains(student1);
        }

        System.out.println(student1.getUserType());
        student1.evaluate(30);
        student1.evaluate(90);

        //for
        //while
        //do while

        //Streams API

        List<String> strings1 = new ArrayList<>();
        strings1.add("A");
        strings1.add("B");
        strings1.add("C");

        Iterator<String> iterator = strings1.iterator();
        while (iterator.hasNext()) {
            String a = iterator.next();
            System.out.println(a);
        }


        for (String str : strings1) {
            if (!(str.equals("B"))) {
                strings1.remove(str);
            }
        }

        strings1.stream().filter(s1 -> s1.equals("B")).sorted().collect(Collectors.toList());

        studentIntegerMap.entrySet().stream().forEach(Map.Entry::getValue);

        studentList.stream().forEach(Student::evaluate);

        Connection connection = PostgresManager.getConnection();
        /*Statement statement = connection.createStatement();
        statement.executeQuery("seelct * from weather")*/














    }
}
