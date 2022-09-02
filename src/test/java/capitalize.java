public class capitalize {
    public static void main(String[] args) {
        capitalize("qAmes ");
    }
    public static String capitalize(String word) {
        // TODO
        String[] arr = word.split(" ");
        String capitalizedWord = "";
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            capitalizedWord += "" + arr[i].substring(0,1).toUpperCase() + arr[i].substring(1).toLowerCase() + " ";
            System.out.println(capitalizedWord);
        }
        return capitalizedWord.trim().toString();
    }


}
