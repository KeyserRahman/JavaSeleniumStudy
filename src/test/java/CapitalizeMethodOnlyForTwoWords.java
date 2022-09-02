public class CapitalizeMethodOnlyForTwoWords {
public static String capitalize(String word) {
        // TODO
       int indexSpace = -1;
       String capitalizedWord = "";
       for (int i = 0; i < word.length()-1; i++) {
        if(word.substring(i,i+1).isBlank()){
         indexSpace = i;
        }
       }
       if(indexSpace == -1){
           capitalizedWord = word.substring(0,1).toUpperCase()
                   + word.substring(1).toLowerCase();
       }else{
           capitalizedWord = word.substring(0,1).toUpperCase()
                   + word.substring(1, indexSpace).toLowerCase()
                   + " "
                   + word.substring(indexSpace+1, indexSpace+2).toUpperCase()
                   + word.substring(indexSpace+2).toLowerCase();
       }
    //System.out.println(indexSpace);
        return capitalizedWord;
    }
    public static void main(String[] args) {        ;
        System.out.println(capitalize("qAmes bOnD asDs"));
    }
}
