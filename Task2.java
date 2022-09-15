package Laboratorka2;

public class Task2 {
    public static void main(String[] args) {
        Subject[] Polapa = {
                new Subject(new String[]{"Eng", "tok","otygk"}, new int[]{3,2,5}, new String[]{"13:10","11:00","16:10"}),
        };
        String[] newSubject = {"ogk,","otltg,","ot,g"};

        Student student = new Student("Maxim", 18, "IT");
        StudentWithSubject studentPolapa = new StudentWithSubject("Polapa", 20, "IT",Polapa );

        System.out.println(student);
        studentPolapa.print();

        studentPolapa.renameSubjects(newSubject);
        studentPolapa.print();

        studentPolapa.renameStudent("Nika");
        studentPolapa.print();
    }
}
