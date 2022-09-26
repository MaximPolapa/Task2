package Laboratorka2.Task2;

import java.util.Map;

public class StudentWithSubject extends Student {
    private Map<Subject, Integer> marksForSubjects;
    private University univer;

    public StudentWithSubject(String name, int age,University univer,Map<Subject, Integer> marksForSubjects) {
        super(name, age);
        this.marksForSubjects = marksForSubjects;
        this.univer = univer;
    }

    public Map<Subject, Integer> getMarksForSubjects() {
        return marksForSubjects;
    }

    public void setMarksForSubjects(Map<Subject, Integer> marksForSubjects) {
        this.marksForSubjects = marksForSubjects;
    }

    public University getUniver() {
        return univer;
    }

    public void setUniver(University univer) {
        this.univer = univer;
    }


    @Override
    public String toString() {
        return '\n'+getName() +
                " marksForSubjects=" + marksForSubjects +
                ", univer=" + univer.getNameUniversity() +
                '}';
    }
}
