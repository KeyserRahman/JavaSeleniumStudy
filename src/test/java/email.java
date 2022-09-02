import java.util.Scanner;

public class email {
     public static void main(String[] args) {
            //DO NOT TOUCH FOLLOWING LINE/LINES
            Scanner scan = new Scanner(System.in);
            String email = scan.next();

            //WRITE YOUR CODE BELOW  jeff_bezos@amazon.us  .substring(0, 1).toUpperCase() + str.substring(1);
            int indexOf_ = email.indexOf("_");
            int indexOfA = email.indexOf("@");
            int indexOfDot = email.indexOf(".");
            String firstName = email.substring(0,indexOf_);
            //.substring(0, 1).toUpperCase() + firstName.substring(1);
            firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1);
            String lastName = email.substring((indexOf_ +1),indexOfA);
            lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1);
            String domain = email.substring((indexOfA + 1), indexOfDot);
            domain = domain.substring(0, 1).toUpperCase() + domain.substring(1);
            System.out.println("First name: "+firstName);
            System.out.println("Last name: "+lastName);
            System.out.println("Domain: "+domain);
       }
}
