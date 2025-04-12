package Java06String;

public class String02Builder {

    public static void main(String[] args) {

        StringBuilder st = new StringBuilder("Hello");

        st.append("World");
        System.out.println(st);

        st.setCharAt(1, 'M');
        System.out.println(st);

        st.insert(1, 'A');
        System.out.println(st);

        st.deleteCharAt(0);
        System.out.println(st);

        System.out.println(st.reverse());

        System.out.println(st.delete(0, 3));

        String prevWord = "phYSics";
        // StringBuilder sb = new StringBuilder(str);

        for (int i = 0; i < prevWord.length(); i++) {
            boolean flag = true; // True -> Capital
            char ch = prevWord.charAt(i);
            if (ch == ' ')
                continue;
            int ascii = (int) ch;
            if (ascii >= 97)
                flag = false; // False -> Small

            if (flag) {
                ascii += 32;
                char dh = (char) ascii;
                prevWord = prevWord.substring(0, i) + dh + prevWord.substring(i + 1);
            } else {
                ascii -= 32;
                char dh = (char) ascii;
                prevWord = prevWord.substring(0, i) + dh + prevWord.substring(i + 1);
            }
        }
        System.out.println(prevWord);

        /*
         * Check whether it is Palindrome or not
         */

        String str = "abcdcbc";
        StringBuilder gtr = new StringBuilder(str);
        System.out.println(gtr);

        // String sb = gtr.reverse() + "";

        // if (str.equals(sb)) {
        // System.out.println("Palindrome");
        // } else {
        // System.out.println("Not Palindrome");
        // }

        int i = 0;
        int j = str.length() - 1;
        boolean flag = true;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                System.out.println("Not Palindrome");
                flag = false;
                break;
            }
            i++;
            j--;
        }
        if (flag) {
            System.out.println("Palindrome");
        } else
            System.out.println(" Not Palindrome");

        // String[] arr = new String[] {"Java", "is" ,"the" ,"best" ,"programming"
        // ,"Language"};
        //
        // StringBuilder sb = new StringBuilder();
        // for(String i : arr){
        // sb.append(i).append(" ");
        // }
        //
        // System.out.println(sb);



    }

    // 5. check palindrom number using String Builder
    public static boolean isPalindrome(String str) {
        // Convert the number to a string
        // String str = Integer.toString(num);

        // Reverse the string
        StringBuilder reversed = new StringBuilder(str).reverse();
        return str.equals(reversed.toString());
    }
}
