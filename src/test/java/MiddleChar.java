import java.util.Scanner;

public class MiddleChar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        //WRITE YOUR CODE BELOW
        int l = word.length();
        String middle = "";
        if(l%2 == 0){
            middle = word.substring((l/2-1),(l/2+1));

        }else{
            middle = word.substring((l/2), (l/2+1));

        }
        System.out.println(middle);
    }
}
