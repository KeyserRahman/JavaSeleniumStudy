import java.util.Locale;
import java.util.Scanner;

public class WthoutX {
    public static void main(String[] args) {
        //DO NOT TOUCH BELOW
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        //WRITE YOUR CODE HERE
       if (word.contains("x") || word.contains("X")){
           String newWord = word;
           newWord = newWord.toLowerCase();
           if(newWord.charAt(0) == 'x'){
               if(newWord.charAt(newWord.length()-1) == 'x'){
                   word = word.substring(1,(word.length()-1));
                   System.out.println(word);
                   return;
               }else{
                   word = word.substring(1,(word.length()));
                   System.out.println(word);
                   return;
               }

           } else if (newWord.charAt(newWord.length()-1) == 'x') {
               word = word.substring(0,(word.length()-1));
               System.out.println(word);
               return;
           }else{
               System.out.println(word);
               return;
           }
       }else{
           System.out.println(word);
       }

    }
}
