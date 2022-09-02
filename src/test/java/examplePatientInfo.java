import java.util.Scanner;

public class examplePatientInfo {
    public static void main(String[] args) {
        //Enter your code here
        String firstName, lastName, email, street, state, city;
        Scanner scan = new Scanner(System.in);
        // this part is already provided DO NOT CHANGE
        String workPhone, personPhone;
        int age, zipCode;
        double height, weight;
        boolean isMarried;

        System.out.println("Welcome to the patient portal!");
        System.out.println("Please enter your personal information");
        System.out.println("Enter your first name");
        firstName = scan.next();
        System.out.println("Enter your last name");
        lastName = scan.next();
        System.out.println("Enter your email");
        email = scan.next();
        scan.nextLine();
        System.out.println("Enter your street");
        street = scan.next();
        scan.nextLine();
        System.out.println("Enter your city");
        city = scan.nextLine();
        //scan.nextLine();
        System.out.println("Enter your state");
        state = scan.next();
        System.out.println("Enter your zip code");
        zipCode = scan.nextInt();
        System.out.println("Enter your work phone number");
        workPhone = scan.next();
        System.out.println("Enter your personal phone number");
        personPhone = scan.next();
        System.out.println("Enter your age");
        age = scan.nextInt();
        System.out.println("Enter your height");
        height = scan.nextDouble();
        System.out.println("Enter your weight");
        weight = scan.nextDouble();
        System.out.println("Are you married?");
        isMarried = scan.nextBoolean();

        System.out.println("Patient personal information");
        System.out.println("Full name: " + firstName +" " + lastName);
        System.out.println(street);
        System.out.println("Address: " + street + " " + city + " " + "state" + " " + zipCode);
        System.out.println("Contact: work phone number: " + workPhone + ", personal phone number: " + personPhone + ", email: " + email);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Weight: " + weight + " pounds");
        System.out.println("Married: " + isMarried);
    }
}
