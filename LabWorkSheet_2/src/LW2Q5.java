import java.util.Scanner;

    public class LW2Q5 {

        public static void main(String[] arr) {
            System.out.println("Enter a string: ");
            Scanner word = new Scanner(System.in);
            String str = word.nextLine();
            String reverseStr = "";

            str = str.replace("!","").replace(" ","");

            int strLength = str.length();
//
            for (int i = (strLength - 1); i >= 0; --i) {
                reverseStr = reverseStr + str.charAt(i);
            }

            if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
                System.out.println(str + " is a Palindrome String.");
            } else {
                System.out.println(str + " is not a Palindrome String.");
            }
        }
    }

