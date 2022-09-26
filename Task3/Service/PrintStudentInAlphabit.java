package Laboratorka2.Task3.Service;

import Laboratorka2.Task2.Group;
import Laboratorka2.Task2.StudentWithSubject;

import java.util.Comparator;

public class PrintStudentInAlphabit {


    public PrintStudentInAlphabit() {
    }


    public void printStudent(final Group group) {
        group.getStudents().sort(Comparator.comparing(StudentWithSubject::getName));
        System.out.println(group.getStudents());
    }

}
