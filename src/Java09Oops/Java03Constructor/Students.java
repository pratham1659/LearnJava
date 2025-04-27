package Java09Oops.Java03Constructor;

public class Students {

    private int roll;
    private String name;
    private double per;

    public Students() {
        System.out.println("Constructor Called....");
        roll = 123;
        name = "Pratham";
        per = 78;
    }

    public Students(int r, String n, double p) {
        roll = r;
        name = n;
        per = p;
        System.out.println("Constructor Called....");
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

        Students obj = new Students();
        obj.showStudent();

        Students obj1 = new Students(134, "Rahul", 89.00);
        obj1.showStudent();

        Students obj2 = new Students(23, "Sonal", 67.99);
        obj2.showStudent();

    }
}