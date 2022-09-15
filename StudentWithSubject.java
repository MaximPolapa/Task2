package Laboratorka2;

public class StudentWithSubject extends Student {
    private Subject[] subject;

    public StudentWithSubject(String name, int age, String group, Subject[] subject) {
        super(name, age, group);
        this.subject = subject;
    }

    public Subject[] getSubject() {
        return subject;
    }

    public void setSubject(Subject[] subject) {
        this.subject = subject;
    }

    public void renameSubjects(String[] newSubject){
        for(Subject sub:subject){
            sub.setSubject(newSubject);
        }
    }
    public void renameStudent(String newName){
        super.setName(newName);
    }

    public void print() {
        System.out.print("Name=" + super.getName() + " " +
                "Age=" + super.getAge() + " " +
                "Group=" + super.getGroup() + " ");
        for (int i = 0; i < subject.length; i++) {
            System.out.print(subject[i] + ":");

        }
        System.out.println("\n");
    }
}
