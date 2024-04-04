package Java04Array;

public class Array1Basic {

    static void sum(int a, int b) {
        int c = a + b;
        System.out.println(c);
    }

    void singleArray() {
//        Representation of Arrays
        int[] uid;
//        String[] name;
        String roll[];
        float price[];

//        Array literals
//        int[] arr = {1,2,3,4,5};
//        int[] age = new int[10]; //Size fo an Array
//        arr[1] = 34;
//        System.out.println(arr[2]);
        int[] ages = {45, 56, 67, 89, 32, 76, 54};
        System.out.println(ages.length);

//        for(int i=0; i<ages.length; i++){
//            System.out.print(ages[i] + " ");
//        }
//        //forEach Loops
//       for(int i: ages){
//           System.out.print(i + " ");
//       }

        int k = 0;
        while (k < ages.length) {
            System.out.print(ages[k] + " ");
            k++;
        }


//        String[] name = {"Raj", "Vikash", "Ball", "Hero"};
//        System.out.println(name[1]);

    }

    void multiArray() {
//        int[][] arr2d = new int [3][3];

        int[][] arr2d = {{23, 34, 34}, {34, 78, 98}, {56, 76, 67}};

        System.out.println(arr2d[0][0]); // 23
        System.out.println(arr2d[1][1]); // 78

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr2d[i][j] + " ");
            }
            System.out.println();
        }
    }

    void sumOfArray() {

        int[] arr = {1, 2, 3, 4, 6, 7, 8};
        int sum = 0;

        for (int i : arr) {
            sum = sum + i;
        }
        System.out.print(sum);
    }

    public static void main(String[] args) {

        Array1Basic obj = new Array1Basic();

//        sum(23, 34);
//        obj.singleArray();
//        obj.multiArray();
//        obj.sumOfArray();


    }
}
