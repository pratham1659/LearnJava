package Java09Oops.Java07Encapsulation.getterSetter;

public class Students {

    private int roll;
    private String name;
    private double price;

    public Students(int r, String n, int p) {
        roll = r;
        name = n;
        price = p;
    }

    public void setRoll(int r) {
        if (r <= 0) {
            System.out.println("Id cannot negative");
            return;
        }
        roll = r;
    }

    public void setName(String n) {
        name = n;
    }

    public void setPrice(Double p) {
        if (p <= 0.00) {
            System.out.println("Price cannot be Negative");
            return;
        }
        price = p;
    }

    public int getRoll() {
        return roll;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public static void main(String[] args) {

        Students st = new Students(76, "Rahul", 89);

        System.out.println("Name: " + st.getName());
        System.out.println("Roll: " + st.getRoll());
        System.out.println("Price: " + st.getPrice());

        st.setRoll(89);
        st.setName("Pratham");
        st.setPrice(78.99);

        System.out.println("Name: " + st.getName());
        System.out.println("Roll: " + st.getRoll());
        System.out.println("Price: " + st.getPrice());

    }

}
