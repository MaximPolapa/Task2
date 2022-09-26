package Laboratorka2.Task2;

import java.util.Map;

public class Subject {
    private String nameSubject;
    private String date;

    public Subject(String nameSubject, String date) {
        this.nameSubject = nameSubject;
        this.date = date;
    }

    public String getNameSubject() {
        return nameSubject;
    }

    public void setNameSubject(String nameSubject) {
        this.nameSubject = nameSubject;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return
                "nameSubject='" + nameSubject + '\'' +
                ", date='" + date + " Marks";
    }
}
