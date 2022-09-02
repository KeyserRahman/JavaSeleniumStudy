import java.util.Locale;
import java.util.Scanner;

public class FixName {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter first name");
        String fName = scan.next();
        System.out.println("enter last name");
        String lName = scan.next();
        String fixedFName = fName.toLowerCase();

        fixedFName = fixedFName.substring(0).toUpperCase();
    }
}
