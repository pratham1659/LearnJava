package Collections.ArrayList;

import java.util.*;

class Student {
    int rollNo;
    String name;
    int age;

    public Student(int rollNo, String name, int age) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
    }
}

public class Java2ArrayList {

    public static void addElementsInArrayList() {
        ArrayList<String> name = new ArrayList<String>();

        name.add("Boys---------");
        name.add("Pratham");
        name.add("Rohan");
        name.add("Vikash");

        ArrayList<String> name2 = new ArrayList<String>();

        name2.add("Girls_______");
        name2.add("Ankita");
        name2.add("Shivani");

        name.addAll(name2);

        System.out.println(name);

        name.set(2, "Isha");

        System.out.println(name);
    }

    public static void removeElementArray() {

        System.out.println("removeElementArray");
        ArrayList<String> name = new ArrayList<String>();

        name.add("Ankita");
        name.add("Palak");
        name.add("Isha");
        name.add("Ravi");
        name.add("Vijay");
        name.add("Ajay");
        name.add("Anuj");
        name.add("Gaurav");

        // JDK 8 - streams with lambda
        System.out.print("An intial List of element: ");
        name.stream().forEach(element -> System.out.print(element + " "));

        System.out.println("----");
        name.remove("Ankita");
        System.out.println("AfterRemoveElement: " + name);

        name.remove(2);
        System.out.println("AfterRemoveElement of index 2: " + name);

        ArrayList<String> name2 = new ArrayList<String>();

        name2.add("Ravi");
        name2.add("Hanuman");

        name.addAll(name2);

        System.out.println("Updated name2: " + name);

        name.removeAll(name2);

        System.out.println("Updated name2: " + name);

        // Using Lamba Expression
        name.removeIf(str -> str.contains("Gaurav"));

        System.out.println("list after removeIf: " + name);

        name.clear();

        System.out.println("Is ArrayList is Empty: " + name.isEmpty());

    }

    public static void main(String[] args) {

        Student str1 = new Student(1, "Pratham", 23);
        Student str2 = new Student(2, "Rohan", 34);
        Student str3 = new Student(3, "Alok", 34);

        ArrayList<Student> al = new ArrayList<Student>();
        al.add(str1);
        al.add(str2);
        al.add(str3);

        Iterator<Student> iter = al.iterator();
        while (iter.hasNext()) {
            Student st = (Student) iter.next();
            System.out.println(st.rollNo + " " + st.name + " " + st.age);
        }

        System.out.println("----");
        // JDK 8 - streams with lambda
        al.stream().forEach(element -> System.out.println(element));

        System.out.println("----");
        addElementsInArrayList();

        System.out.println("----");
        removeElementArray();

    }
}
