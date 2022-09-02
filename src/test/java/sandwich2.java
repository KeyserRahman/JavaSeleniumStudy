import java.util.Scanner;

public class sandwich2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        int firstBread=str.indexOf("bread");
        int secondBread= str.lastIndexOf("bread");

        if(firstBread!=secondBread){
            System.out.println(str.substring(firstBread+5,secondBread));
        }else{
            System.out.println("nothing");
        }
    }
}
