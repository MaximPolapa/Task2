package Laboratorka2.Task2;

import java.util.List;

public class Group {
        private String nameGroup;
        private List<StudentWithSubject> students;

    public Group(String nameGroup, List<StudentWithSubject> students) {
        this.nameGroup = nameGroup;
        this.students = students;

    }

    public String getNameGroup() {
        return nameGroup;
    }

    public void setNameGroup(String nameGroup) {
        this.nameGroup = nameGroup;
    }

    public List<StudentWithSubject> getStudents() {
        return students;
    }

    public void setStudents(List<StudentWithSubject> students) {
        this.students = students;
    }


    @Override
    public String toString() {
        return '\n'+"Group{" +
                "nameGroup='" + nameGroup + '\'' +
                ", students=" + students +
                '}';
    }
}
