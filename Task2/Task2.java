package Laboratorka2.Task2;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Task2 {

    public static void main(String[] args) {
        University universityLvivLpnu = new University("LPNU", new ArrayList<>());
        Subject subject1ForIT = new Subject("Math", "18.06");
        Subject subject2ForIT = new Subject("Ukr", "17.06");
        Subject subject3ForIT = new Subject("Eng", "13.06");

        Subject subject1ForIK = new Subject("Ma", "19.06");
        Subject subject2ForIK = new Subject("U", "19.06");
        Subject subject3ForIK = new Subject("E", "14.06");

        StudentWithSubject[] studentsIT = new StudentWithSubject[]{
                new StudentWithSubject("Max", 18, universityLvivLpnu, new HashMap<>() {
                    {
                        put(subject1ForIT,45);
                        put(subject2ForIT,84);
                        put(subject3ForIT,75);
                    }
                }),
                new StudentWithSubject("Sanya", 18, universityLvivLpnu, new HashMap<>() {
                    {
                        put(subject1ForIT,99);
                        put(subject2ForIT,99);
                        put(subject3ForIT,99);
                    }
                }),
        };
        StudentWithSubject[] studentsIK = new StudentWithSubject[]{
                new StudentWithSubject("Mix", 18, universityLvivLpnu, new HashMap<>() {
                    {
                        put(subject1ForIK,45);
                        put(subject2ForIK,84);
                        put(subject3ForIK,75);
                    }
                }),
                new StudentWithSubject("Saaaaaaaaaaaaaaanya", 19, universityLvivLpnu, new HashMap<>() {
                    {
                        put(subject1ForIK,99);
                        put(subject2ForIK,99);
                        put(subject3ForIK,99);
                    }
                })
        };

        universityLvivLpnu.getGroups().add(new Group("IT", Arrays.asList(studentsIT)));
        universityLvivLpnu.getGroups().add(new Group("IK", Arrays.asList(studentsIK)));


        for (StudentWithSubject studentsit : studentsIT) {
            System.out.println(studentsit);
        }
        //System.out.println(universityLvivLpnu);
    }

}


