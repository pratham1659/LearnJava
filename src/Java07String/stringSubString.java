package Java07String;

public class stringSubString {
    public static void main(String[] args) {

//        String str = "abcd";
//        System.out.println(str.substring(0,3));
//        System.out.println(str.substring(2));

//        What will be the output of following code?

//        String s = "physics";
//        for(int i=2;i<4;i++){
//            System.out.println(s.substring(i));
//        }

//        write a code to print substring
        String str = "abcd";
        for(int i=0;i<=3;i++){
            for(int j=i+1;j<=4;j++){
                System.out.print(str.substring(i,j) + " ");
            }
        }




    }
}
