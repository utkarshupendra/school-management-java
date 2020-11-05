package employee;

import enums.ContractTenure;
import enums.Department;
import enums.UserType;

public class Support extends Employee {
    public Support(String name, String id, long contact, String address, float salary, String qualification, ContractTenure tenure, String designation, Department department, String subject) {
        setEmployeeFields(name, id, contact, address, salary, qualification, tenure, designation, department, true);
    }
    @Override
    public UserType getUserType() {
        return UserType.SUPPORT;
    }
}
