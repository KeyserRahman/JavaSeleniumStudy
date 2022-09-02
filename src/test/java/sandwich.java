import java.util.Scanner;

public class sandwich {
    public static void main(String[] args) {
        //DO NOT TOUCH FOLLOWING LINE/LINES
        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        //WRITE YOUR CODE BELOW
        if (str.contains("bread")) {

            if (str.replaceFirst("bread", "").contains("bread")) {
              int indexOfFirstBread = str.indexOf("bread",0);
              int indexOflastBread = str.indexOf("bread",(indexOfFirstBread + 5));
              String inside = str.substring(indexOfFirstBread + 5, indexOflastBread);
              System.out.println(inside);
            }else if (str.contains("bread")) {
                System.out.println("nothing");
            }
        } else {
            System.out.println("nothing");
        }
    }
}


