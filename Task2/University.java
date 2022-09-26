package Laboratorka2.Task2;

import java.util.List;
import java.util.stream.Stream;

public class University {
    private String nameUniversity;
    private List<Group> groups;

    public University(String nameUniversity, List<Group> groups) {
        this.nameUniversity = nameUniversity;
        this.groups = groups;
    }

    public University(String comp_ingenering, Stream<Group> groupStream, Group group, Group group1) {
    }

    public String getNameUniversity() {
        return nameUniversity;
    }

    public void setNameUniversity(String nameUniversity) {
        this.nameUniversity = nameUniversity;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

    @Override
    public String toString() {
        return "University{" +
                "nameUniversity='" + nameUniversity + '\'' +
                ", groups=" + groups +
                '}';
    }
}
