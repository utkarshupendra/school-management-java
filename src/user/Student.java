package user;

import enums.UserType;

public class Student extends User {
    private static int passingMarks = 40;
    private int grade;
    private char section;
    private float percentage;

    public Student(String name, String id, long contact, String address, int grade, char section, float percentage) {
        this.setName(name);
        this.setId(id);
        this.setContact(contact);
        this.setAddress(address);
        this.grade = grade;
        this.section = section;
        this.percentage = percentage;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public char getSection() {
        return section;
    }

    public void setSection(char section) {
        this.section = section;
    }

    public float getPercentage() {
        return percentage;
    }

    public void setPercentage(float percentage) {
        this.percentage = percentage;
    }

    @Override
    public UserType getUserType() {
        return UserType.STUDENT;
    }

    public void evaluate(int marks) {
        if (marks > passingMarks)
            this.grade++;
    }
}
