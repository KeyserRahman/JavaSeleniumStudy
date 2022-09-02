public class ReverseWordsByForEachLoop {
    public static void main(String[] args) {
        String word = "word";
        int gffg = word.indexOf("or");
        String reservedWord = "";
        int length = word.length();
        for (int i = length-1; i>= 0; i--){
         reservedWord += word.charAt(i);
        }
        System.out.println(reservedWord);
        System.out.println(gffg);
    }
}
