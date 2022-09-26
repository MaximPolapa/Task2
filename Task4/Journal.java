package Laboratorka2.Task4;

import Laboratorka2.Task2.*;

import java.util.*;

public class Journal {
    private University university;
    private Student student;
    private Map<Subject, Integer> marksForSubject;

    public Journal(University university, Student student, Map<Subject, Integer> marksForSubject) {
        this.university = university;
        this.student = student;
        this.marksForSubject = marksForSubject;
    }

    public University getUniversity() {
        return university;
    }

    public void setUniversity(University university) {
        this.university = university;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Map<Subject, Integer> getMarksForSubject() {
        return marksForSubject;
    }

    public void setMarksForSubject(Map<Subject, Integer> marksForSubject) {
        this.marksForSubject = marksForSubject;
    }



    public void changeMarksSubject(final Subject nameSubject, final Integer newValue) {
        marksForSubject.put(nameSubject, newValue);
    }

    public static List<Student> getAllStudent(final University university) {
        final List<Student> allStudent = new ArrayList<>();
        university.getGroups().forEach(e -> allStudent.addAll(e.getStudents()));
        return allStudent;
    }

    public static Journal getMarksStudent(final University university, final StudentWithSubject student) {
        Student findStudent = getAllStudent(university)
                .stream()
                .filter(e -> e.equals(student))
                .findFirst().get();
        return new Journal(university, student, ((StudentWithSubject) findStudent).getMarksForSubjects());
    }

    public  List<Journal> getAllMarks(final University university) {
        final List<Journal> allJournal = new ArrayList<>();
        getAllStudent(university)
                .forEach(e->allJournal.add(getMarksStudent(university,(StudentWithSubject) e)));
        return allJournal;
    }

    public  List<Integer> getMarksForSubject(final University university, final Subject nameSubject) {
        final List<Integer> list = new ArrayList<>();

        for(final Group group:university.getGroups()){
            for(final StudentWithSubject studentWithSubject:group.getStudents()){
                for (Map.Entry<Subject,Integer> entry:studentWithSubject.getMarksForSubjects().entrySet()){
                    if(entry.getKey().equals(nameSubject)){
                        list.add(entry.getValue());
                    }
                }
            }
        }
        return list;
    }


    @Override
    public String toString() {
        return "Journal{" +
                "university=" + university +
                ", student=" + student +
                ", marksForSubject=" + marksForSubject +
                '}';
    }
}
