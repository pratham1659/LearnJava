package Temp;

import java.util.*;

public class HasNext {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int lineNumber = 1;

        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            System.out.println(lineNumber++ + " " + line);
        }

        sc.close();

    }
}