package com.epam.automation;

import java.util.ArrayList;

public class Action {

    private ArrayList<Student> listOfStudents = new ArrayList<>();
    private ArrayList<Student> listOfStudentsOfFaculty = new ArrayList<>();
    private ArrayList<Student> listOfStudentsBornAfter = new ArrayList<>();
    private ArrayList<Student> listOfStudentsOfGroup = new ArrayList<>();
    private ArrayList<Student> listOfStudentsFacultyAndGroup = new ArrayList<>();

    public void addStudentInList(Student student) {
        listOfStudents.add(student);
    }



    public ArrayList<Student> studentsOfFaculty(String nameFaculty) {
        for (Student student : listOfStudents) {
            if (student.getStudentFaculty().equals(nameFaculty)) {
                listOfStudentsOfFaculty.add(student);
            }
        }
        return listOfStudentsOfFaculty;
    }

    public void printListStudentOfFaculty(){
        for (Student student : listOfStudentsOfFaculty) {
            System.out.println(student);
        }
    }



    public ArrayList<Student> studentsBornAfter(int yearOfBirth) {
        for (Student student : listOfStudents) {
            int year = Integer.parseInt(student.getStudentDateBirth().substring(6));
            if (year > yearOfBirth) {
                listOfStudentsBornAfter.add(student);
            }
        }
        return listOfStudentsBornAfter;
    }

    public void printListStudentBornAfter(){
        for (Student student : listOfStudentsBornAfter) {
            System.out.println(student);
        }
    }



    public ArrayList<Student> studentsOfGroup(String groupName) {
        for (Student student : listOfStudents) {
            if (student.getStudentGroupName().equals(groupName)) {
                listOfStudentsOfGroup.add(student);
            }
        }
        return listOfStudentsOfGroup;
    }

    public void printListStudentGroup(){
        for (Student student : listOfStudentsOfGroup) {
            System.out.println(student);
        }
    }



    public ArrayList<Student> studentsOfFacultyAndYearOfStudy(String nameFaculty, String yearOfStudy) {
        for (Student student : listOfStudents) {
            if (student.getStudentFaculty().equals(nameFaculty) & student.getStudentYearStudy().equals(yearOfStudy)) {
                listOfStudentsFacultyAndGroup.add(student);
            }
        }
        return listOfStudentsFacultyAndGroup;
    }

    public void printListOfStudentsFacultyAndGroup(){
        for (Student student : listOfStudentsFacultyAndGroup) {
            System.out.println(student);
        }
    }
}
