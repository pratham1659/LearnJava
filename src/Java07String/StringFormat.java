package Java07String;

public class StringFormat {



    public static void main(String[] args) {
        String name = "Sandeep";
        int marks = 23455;

        System.out.println("Hello " + name + ", Your marks are: " + marks);
        System.out.printf("Hello %S, Your marks are: %,5d", name, marks);
        System.out.println();


        StringBuilder str = new StringBuilder("First ");

        str.append(45);
        str.append(" Second");
        str.append(", now this is the ");
        str.append(76.59);
        str.toString();
        System.out.println(str);

    }
}
