package com.epam.automation;

public class StudentMain {
    public static void main(String[] args) {
        Action listOfObjects = new Action();

        listOfObjects.addStudentInList(new Student(1, "Азимов", "Исаак",
                "Юдович", "02.01.1920", "482-82-36",
                "Химический", "2", "Х2021Г1"));

        listOfObjects.addStudentInList(new Student(2, "Беляев", "Александр",
                "Романович", "16.03.1884", "587-78-26",
                "Философии", "1", "Ф2021Г4"));

        listOfObjects.addStudentInList(new Student(3, "Гибсон", "Уильям",
                "Форд", "13.11.1914", "349-35-46",
                "Философии", "3", "Ф2021Г2"));

        listOfObjects.addStudentInList(new Student(4, "Андерсон", "Пол",
                "Уильям", "25.11.1926", "687-34-16",
                "Экономический", "1", "Э2021Г15"));

        listOfObjects.addStudentInList(new Student(5, "Ефремов", "Иван",
                "Анатольевич", "22.04.1908", "879-89-26",
                "Экономический", "1", "Э2021Г15"));

        listOfObjects.addStudentInList(new Student(6, "Герберт", "Франклин",
                "Патрик", "08.10.1920", "879-39-79",
                "Зарубежной литературы", "3", ""));

        listOfObjects.addStudentInList(new Student(7, "Маск", "Илон",
                "Рив", "28.06.1971", "136-53-64",
                "", "3", "Э2021Г13"));

        listOfObjects.addStudentInList(new Student(8, "Хэнцис", "Марина",
                "Энн", "14.03.1988", "361-41-97",
                "", "1", ""));

        listOfObjects.addStudentInList(new Student(9, "Сидоров", "Петр",
                "Иванович", "13.11.1914", "349-35-46",
                "Философии", "3", "Ф2021Г2"));



        System.out.println("List of students of a given faculty:");
        listOfObjects.studentsOfFaculty("Экономический");
        listOfObjects.printListStudentOfFaculty();
        System.out.println();



        System.out.println("Lists of students for each faculty and year of study:");
        listOfObjects.studentsOfFacultyAndYearOfStudy("Философии", "3");
        listOfObjects.printListOfStudentsFacultyAndGroup();
        System.out.println();



        System.out.println("Lists of students born after a given year:");
        listOfObjects.studentsBornAfter(1920);
        listOfObjects.printListStudentBornAfter();
        System.out.println();



        System.out.println("Lists of students of a given group:");
        listOfObjects.studentsOfGroup("Э2021Г15");
        listOfObjects.printListStudentGroup();
    }
}
