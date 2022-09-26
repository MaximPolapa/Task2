package Laboratorka2.Task3;
import Laboratorka2.Task2.Group;
import Laboratorka2.Task2.StudentWithSubject;
import Laboratorka2.Task2.Subject;
import Laboratorka2.Task2.University;
import Laboratorka2.Task3.Service.AddInformationForSubject;
import Laboratorka2.Task3.Service.AddSubject;
import Laboratorka2.Task3.Service.PrintStudentCertainSubject;
import Laboratorka2.Task3.Service.PrintStudentInAlphabit;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Task3 {
    public static void main(String[] args) {
        University universityLvivLpnu = new University("LPNU", new ArrayList<>());
        Subject subject1ForIT = new Subject("Math", "18.06");
        Subject subject2ForIT = new Subject("Ukr", "17.06");
        Subject subject3ForIT = new Subject("Eng", "13.06");

        Subject subject1ForIK = new Subject("Ma", "19.06");
        Subject subject2ForIK = new Subject("U", "19.06");
        Subject subject3ForIK = new Subject("E", "14.06");

        StudentWithSubject[] studentsIT = new StudentWithSubject[]{
                new StudentWithSubject("zzzzzz", 19, universityLvivLpnu, new HashMap<>() {
                    {
                        put(new Subject("TESTSUBJECT","30.07"),99);
                        put(subject2ForIK,99);
                        put(subject3ForIK,99);
                    }
                }),
                new StudentWithSubject("max", 18, universityLvivLpnu, new HashMap<>() {
                    {
                        put(subject1ForIT,45);
                        put(subject2ForIT,84);
                        put(subject3ForIT,75);
                    }
                }),
                new StudentWithSubject("sanya", 18, universityLvivLpnu, new HashMap<>() {
                    {
                        put(subject1ForIT,99);
                        put(subject2ForIT,99);
                        put(subject3ForIT,99);
                    }
                }),
        };
        StudentWithSubject[] studentsIK = new StudentWithSubject[]{
                new StudentWithSubject("mix", 18, universityLvivLpnu, new HashMap<>() {
                    {
                        put(subject1ForIK,45);
                        put(subject2ForIK,84);
                        put(subject3ForIK,75);
                    }
                }),
                new StudentWithSubject("saaaaaaaaaaaaaaanya", 19, universityLvivLpnu, new HashMap<>() {
                    {
                        put(subject1ForIK,99);
                        put(subject2ForIK,99);
                        put(subject3ForIK,99);
                    }
                }),

        };


        universityLvivLpnu.getGroups().add(new Group("IT", Arrays.asList(studentsIT)));
        universityLvivLpnu.getGroups().add(new Group("IK", Arrays.asList(studentsIK)));

        System.out.println(universityLvivLpnu);
        System.out.println();


        AddSubject addSubject = new AddSubject();
        addSubject.addNewSubject(universityLvivLpnu.getGroups().get(0),
                new Subject("DataANAlize","18.06"));

        AddInformationForSubject addInformationForSubject = new AddInformationForSubject();
        addInformationForSubject.addNewDate(universityLvivLpnu.getGroups().get(1),
                new Subject("Programming","30.05"));

        PrintStudentInAlphabit printstudent = new PrintStudentInAlphabit();

        System.out.println(universityLvivLpnu);

        System.out.println("\n"+"\n");
        printstudent.printStudent(universityLvivLpnu.getGroups().get(0));

        System.out.println("\n"+"\n");

        PrintStudentCertainSubject printStudentCertainSubject = new PrintStudentCertainSubject();
        printStudentCertainSubject.printStudentCertainSubject(universityLvivLpnu,
                subject1ForIK);

        System.out.println("\n"+"\n");


    }
}
