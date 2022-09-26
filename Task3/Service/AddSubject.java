package Laboratorka2.Task3.Service;

import Laboratorka2.Task2.*;

import java.util.List;

public class AddSubject {

    public AddSubject() {
    }

    public List<Subject> getSubjectByGroup(final Group group) {
        return group.getStudents().get(0).getMarksForSubjects().keySet().stream().toList();
    }

    public void addNewSubject(final Group group, final Subject newSubject) {
        for (StudentWithSubject student : group.getStudents()) {
            student.getMarksForSubjects().put(newSubject,0);
        }

    }

}
