package com.epam.automation;

public class Student {
    private int studentId;
    private String studentLastName;
    private String studentFirstName;
    private String studentPatronymic;
    private String studentDateBirth;
    private String studentPhone;
    private String studentFaculty;
    private String studentYearStudy;
    private String studentGroupName;

    public Student(int studentId, String studentLastName, String studentFirstName, String studentPatronymic, String studentDateBirth, String studentPhone, String studentFaculty, String studentYearStudy, String studentGroupName) {
        this.studentId = studentId;
        this.studentLastName = studentLastName;
        this.studentFirstName = studentFirstName;
        this.studentPatronymic = studentPatronymic;
        this.studentDateBirth = studentDateBirth;
        this.studentPhone = studentPhone;
        this.studentFaculty = studentFaculty;
        this.studentYearStudy = studentYearStudy;
        this.studentGroupName = studentGroupName;
    }

    public Student(int studentId, String studentLastName, String studentPhone, String studentFaculty, String studentGroupName) {
        this.studentId = studentId;
        this.studentLastName = studentLastName;
        this.studentPhone = studentPhone;
        this.studentFaculty = studentFaculty;
        this.studentGroupName = studentGroupName;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentLastName() {
        return studentLastName;
    }

    public void setStudentLastName(String studentLastName) {
        this.studentLastName = studentLastName;
    }

    public String getStudentFirstName() {
        return studentFirstName;
    }

    public void setStudentFirstName(String studentFirstName) {
        this.studentFirstName = studentFirstName;
    }

    public String getStudentPatronymic() {
        return studentPatronymic;
    }

    public void setStudentPatronymic(String studentPatronymic) {
        this.studentPatronymic = studentPatronymic;
    }

    public String getStudentDateBirth() {
        return studentDateBirth;
    }

    public void setStudentDateBirth(String studentDateBirth) {
        this.studentDateBirth = studentDateBirth;
    }

    public String getStudentPhone() {
        return studentPhone;
    }

    public void setStudentPhone(String studentPhone) {
        this.studentPhone = studentPhone;
    }

    public String getStudentFaculty() {
        return studentFaculty;
    }

    public void setStudentFaculty(String studentFaculty) {
        this.studentFaculty = studentFaculty;
    }

    public String getStudentYearStudy() {
        return studentYearStudy;
    }

    public void setStudentYearStudy(String studentYearStudy) {
        this.studentYearStudy = studentYearStudy;
    }

    public String getStudentGroupName() {
        return studentGroupName;
    }

    public void setStudentGroupName(String studentGroupName) {
        this.studentGroupName = studentGroupName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentLastName='" + studentLastName + '\'' +
                ", studentFirstName='" + studentFirstName + '\'' +
                ", studentPatronymic='" + studentPatronymic + '\'' +
                ", studentDateBirth='" + studentDateBirth + '\'' +
                ", studentPhone='" + studentPhone + '\'' +
                ", studentFaculty='" + studentFaculty + '\'' +
                ", studentYearStudy=" + studentYearStudy +
                ", studentGroupName='" + studentGroupName + '\'' +
                '}';
    }
}
