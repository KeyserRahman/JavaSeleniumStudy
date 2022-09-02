import java.util.Scanner;

public class emailPriority {
    public static void main(String[] args) {
        //DO NOT TOUCH FOLLOWING LINE/LINES
        Scanner s = new Scanner(System.in);
        String email = s.nextLine();

        //WRITE YOUR CODE BELOW
        if (email.contains("Alejandro") && email.contains("project")){
            System.out.println("priority");
        }else if (email.contains("Alejandro") && !email.contains("project")) {
            System.out.println("read");
        } else {
            System.out.println("don't read");
        }

    }
}
