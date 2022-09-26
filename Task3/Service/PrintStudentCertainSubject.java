package Laboratorka2.Task3.Service;

import Laboratorka2.Task2.Group;
import Laboratorka2.Task2.StudentWithSubject;
import Laboratorka2.Task2.Subject;
import Laboratorka2.Task2.University;

public class PrintStudentCertainSubject {
    public PrintStudentCertainSubject() {
    }

    public void printStudentCertainSubject(University university, Subject visitingSubject){
        for (Group univer:university.getGroups()){
            for(StudentWithSubject student:univer.getStudents()){
                if(student.getMarksForSubjects().get(visitingSubject) != null){
                    System.out.println(student.getName());
                }
                //System.out.println(student.getMarksForSubjects().get(visitingSubject));
                //System.out.println();
            }
            //System.out.println(univer.getStudents());
        }
    }

}
