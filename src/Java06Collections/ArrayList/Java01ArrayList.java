package Java06Collections.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Java01ArrayList {


    static void reverseList(ArrayList<Integer> list){

        int i = 0, j = list.size() - 1;
        System.out.println("Original List: " + list);
        while(i<j){
            /*
            int temp = a;
            a = b;
            b = temp;
             */
            Integer temp = list.get(i);
            list.set(i,list.get(j));
            list.set(j,temp);
            i++;
            j--;
        }
        System.out.println("Reverse List" + list);
    }

    public static void main(String[] args) {

        //Wrapper Classes in Arraylist
//        Integer i = Integer.valueOf(4);
//        System.out.println(i);
//
//        Float f = Float.valueOf(4.5f);
//        System.out.println(f);


        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Boolean> bool = new ArrayList<>();
        ArrayList<Float> flot = new ArrayList<>();

        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(8);
        arr.add(9);


        //get an element at index
        System.out.println(arr.get(2));

        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();

        //printing the array list directly
        System.out.println(arr);

        //adding element at some index i
        arr.add(0, 100);
        System.out.println(arr);


        //modifying element at index i
        arr.set(0, 110);
        System.out.println(arr);


        //removing an element at index i
        arr.remove(0);
        System.out.println(arr);

        //removing an element X
        arr.remove(Integer.valueOf(9));
        System.out.println(arr);


//        if element not present in array
        System.out.println(arr.remove(Integer.valueOf(18)));

        //checking if an element exists
        System.out.println(arr.contains(12));

        ArrayList<Object> any = new ArrayList<>();

        any.add(23);
        any.add("Pratham");

        System.out.println(any);

        ArrayList<Integer> listArr = new ArrayList<>();

        listArr.add(23);
        listArr.add(34);
        listArr.add(45);
        listArr.add(56);
        listArr.add(67);
        listArr.add(78);

        //Reverse an ArrayList
        System.out.println("Reverse Using Collection InBuilt: ");
        Collections.reverse(listArr);
        System.out.println(listArr);
//        reverseList(listArr)


        Collections.sort(listArr);
        System.out.println("Sorted Array: ");
        System.out.println(listArr);


        ArrayList<String> str = new ArrayList<>();

        str.add("Pratham");
        str.add("Papa");
        str.add("Isha");
        str.add("Mom");

        System.out.println("Origin String : ");
        System.out.println(str);
        Collections.reverse(str);
        System.out.println(str);

//        Collections.sort(listArr, Collections.reverseOrder());
        listArr.sort(Collections.reverseOrder());
        System.out.println("Descending Order :");
        System.out.println(listArr);



    }
}
