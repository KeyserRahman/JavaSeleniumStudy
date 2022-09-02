import java.util.ArrayList;

public class findIndexOfCharInString1 {
    public static void main(String[] args) {
        //find all 'O' and count how many 'o' in the String
        String str = "Wooden Spoon";
        char ch = 'o';
        int numOfO = 0;
        //System.out.println(str.charAt(1));
        ArrayList l = new ArrayList();
        for(int i = 0; i < str.length(); i++){
            if (str.charAt(i) == ch){
                //System.out.println("the index of the letter O in the String is: " + i);
                l.add(i);
                numOfO ++;

            }
        }
        if (numOfO == 0){
            System.out.println("There is no O in the String.");
        }else{
            System.out.println("There are : " + numOfO + " 'o' in the string.");
            System.out.println("The indexes of the 'o' in the String is " + l.toString());
        }
    }
}
