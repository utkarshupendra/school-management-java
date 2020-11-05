package employee;

import enums.ContractTenure;
import enums.Department;
import enums.UserType;

public class Teacher extends Employee {
    private String subject;

    public Teacher(String name, String id, long contact, String address, float salary, String qualification, ContractTenure tenure, String designation, Department department, String subject) {
        setEmployeeFields(name, id, contact, address, salary, qualification, tenure, designation, department, true);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public UserType getUserType() {
        return UserType.TEACHER;
    }
}
