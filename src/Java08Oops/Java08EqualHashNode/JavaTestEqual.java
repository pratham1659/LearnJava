package Java10Oops.Java08EqualHashNode;

public class JavaTestEqual {
    public static void main(String[] args) {

        JavaEqualHash person1 = new JavaEqualHash("Pratham", 30 , 123);
        JavaEqualHash person2 = new JavaEqualHash("Pratham", 31, 123);

        if(person1 == person2){
            System.out.println("Equals");
        }else{
            System.out.println("Not Equal");
        }

        if(person1.equals(person2)){
            System.out.println("Equals");
        }else{
            System.out.println("False");
        }

    }
}
