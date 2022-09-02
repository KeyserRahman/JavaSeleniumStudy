import java.util.Arrays;

public class Example1StringMethod {
    public static void main(String[] args) {
        String str = "String";
        // 1. charAt() method
        // given: index in the String
        // output: char at the given index
        char ch1 = str.charAt(2);
        System.out.println("The third letter in the string is: " + ch1);

        // 2. length() method
        // given: String
        // output: length of the given string
        int length = str.length();
        System.out.println("The length of the string is: " + length);

        int lastIndexNum = length - 1;
        char lastLetterOfString = str.charAt(lastIndexNum);
        //System.out.println("The last letter in the String is: " + lastLetterOfString);
        //System.out.println("Example1StringMethod.main");
        //System.out.printf("String");
        System.out.println("args = " + Arrays.deepToString(args));
        System.out.println("lastLetterOfString = " + lastLetterOfString);
    }
}
