package Laboratorka2.Task3.Service;

import Laboratorka2.Task2.Group;
import Laboratorka2.Task2.StudentWithSubject;
import Laboratorka2.Task2.Subject;

public class AddInformationForSubject {
    public AddInformationForSubject() {
    }

    public void addNewDate(final Group group, final Subject newSubject) {
        for (StudentWithSubject student : group.getStudents()) {
            student.getMarksForSubjects().put(newSubject, 0);
        }
    }

}
