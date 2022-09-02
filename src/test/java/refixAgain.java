import java.util.Scanner;

public class refixAgain {
    public static void main(String[] args) {
        //DO NOT TOUCH FOLLOWING LINE/LINES
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int n = scan.nextInt();

        //WRITE YOUR CODE BELOW
        String prefix = str.substring(0,n);
        String rest = str.substring(n,str.length());
        //System.out.println(prefix);
        //System.out.println(rest);
        if(rest.contains(prefix)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

    }
}
