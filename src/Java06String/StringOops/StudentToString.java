package Java06String.StringOops;

public class StudentToString {

    // Define a Student class with fields like name and age, and use toString to
    // print student details.
    String name;
    int age;
    String rollNumber;
    String houseNumber;

    public StudentToString(String name, int age, String rollNumber, String houseNumber) {
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
        this.houseNumber = houseNumber;
    }

    @Override
    public String toString() {
        return "Student Details:{name:" + name
                + ", age:" + age
                + ", roll number:" + rollNumber
                + ", house:" + houseNumber
                + ", }";
    }

    public static void main(String[] args) {

        StudentToString str = new StudentToString("Pratham", 12, "19BCS1659", "12B");

        System.out.println(str.toString());
    }
}
