package Java09Oops.Java07Encapsulation;

public class Student {

    private int roll;
    private String name;
    private double per;

    public Student() {

    }

    public void setStudent(int r, String n, double p) {
        roll = r;
        name = n;
        per = p;
    }

    public void showStudent() {
        System.out.println("Ro1l=" + roll);
        System.out.println("Name=" + name);
        System.out.println("Per=" + per);
    }

    public static void main(String[] args) {

        Student obj = new Student();

        obj.showStudent();

        // s.setStudent(123, "Pratham", 78);
        // s.showStudent();
    }
}