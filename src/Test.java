import java.io.*;
import java.util.*;

public class Test {

    public static void practice(ArrayList<Integer> arr) {

        ArrayList<Integer> list = new ArrayList<>();

        int i = 0;
        int j = arr.size() - 1;

        while (i < j) {
            Integer temp = arr.get(i);
            arr.set(i, arr.get(j));
            arr.set(j, temp);

            i++;
            j--;
        }

        Iterator<Integer> it = arr.iterator();

        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
    }

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        // String str = sc.nextLine();
        int n = sc.nextInt();

        // int[] arr = new int[n];

        // for (int i = 0; i < n; i++) {
        // arr[i] = sc.nextInt();
        // }

        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(8);
        arr.add(9);

        practice(arr);

        sc.close();

    }
}
