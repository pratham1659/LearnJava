package Java09Oops.Java05Inheritance;

class GrandFather {
    void display() {
        System.out.println("GrandFather");
    }
}

class Father extends GrandFather {

    void display() {
        System.out.println("Father");
    }
}

class Uncle extends GrandFather {
    void display() {
        System.out.println("Uncle");
    }
}

class Son extends Father {
    void display() {
        System.out.println("Son");
    }
}

public class Java05Hybrid {

    public static void main(String[] args) {

        Son mySon = new Son();

        mySon.display();

    }

}
