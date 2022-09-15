package Laboratorka2;

import java.util.Arrays;

public class Subject {
    private String[] subject = new String[3];
    private int[] rating = new int[3];
    private String[] time = new String[3];

    public Subject(String[] subject, int[] rating, String[] time) {
        this.subject = subject;
        this.rating = rating;
        this.time = time;
    }

    public String[] getSubject() {
        return subject;
    }

    public void setSubject(String[] subject) {
        this.subject = subject;
    }

    public int[] getRating() {
        return rating;
    }

    public void setRating(int[] rating) {
        this.rating = rating;
    }

    public String[] getTime() {
        return time;
    }

    public void setTime(String[] time) {
        this.time = time;
    }


    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("");

        for (int i = 0; i < subject.length; i++) {
            sb.insert(i, " " + subject[i] + ":" + rating[i] + " time=" + time[i] + "  ");
        }
        return sb.toString();
    }
}
