package Java08Oops;

public class Java03Modifier {

    public String str_1 = "I`m a Public Member";

    void printFromClass(){
        System.out.println("Within Class: " + str_1);
    }
    public static void main(String[] args) {

        Java03Modifier obj = new Java03Modifier();

        obj.printFromClass();
        System.out.println("Within Class: " + obj.str_1);


        App obj2 = new App();

        obj2.printFromOutsideClass();



    }

}

class App{
    void printFromOutsideClass(){
        Java03Modifier obj = new Java03Modifier();
        System.out.println("Within Package, Outside Class: " + obj.str_1);
    }
}