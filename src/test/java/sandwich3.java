import java.util.Scanner;

public class sandwich3 {
    public static void main(String[] args) {
        //DO NOT TOUCH FOLLOWING LINE/LINES
        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        //WRITE YOUR CODE BELOW
        int firstBread = str.indexOf("bread");
        int secondBread = str.lastIndexOf("bread");
        if (firstBread != secondBread){
            System.out.println(str.substring(firstBread + 5, secondBread));
        }else{
            System.out.println("nothing");
        }
    }
}
