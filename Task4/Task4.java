package Laboratorka2.Task4;

import Laboratorka2.Task2.*;

import java.lang.reflect.Array;
import java.util.*;

public class Task4 {
    public static void main(String[] args) {
        University universityLvivLpnu = new University("LPNU", new ArrayList<>());
        List<Student> student = new ArrayList<>();
        Map<String,Integer> marksForSubject = new HashMap<String,Integer>(){{
            put("Memology",50);
        }};
        Subject subject1ForIT = new Subject("Math", "18.06");
        Subject subject2ForIT = new Subject("Ukr", "17.06");
        Subject subject3ForIT = new Subject("Eng", "13.06");

        StudentWithSubject studentIT = new StudentWithSubject("max", 18, universityLvivLpnu, new HashMap<>() {
            {
                put(subject1ForIT,45);
                put(subject2ForIT,84);
                put(subject3ForIT,75);
            }
        });
        StudentWithSubject studentI = new StudentWithSubject("Mix", 18, universityLvivLpnu, new HashMap<>() {
            {
                put(subject1ForIT,99);
                put(subject2ForIT,99);
                put(subject3ForIT,99);
            }
        });

        universityLvivLpnu.getGroups().add(new Group("IT", Arrays.asList(studentIT)));
        universityLvivLpnu.getGroups().add(new Group("IL", Arrays.asList(studentI)));


        student.add(new Student("Max",18));
        student.add(new Student("Mix",19));
        for (Student stud:student){
            System.out.println(stud.getName() + " " + stud.getAge());
        }


        Journal journal = Journal.getMarksStudent(universityLvivLpnu,studentIT);
        System.out.println(journal);
        journal.getAllMarks(universityLvivLpnu).forEach(System.out::println);
        System.out.println(journal.getMarksForSubject(universityLvivLpnu,subject1ForIT));
    }
}
