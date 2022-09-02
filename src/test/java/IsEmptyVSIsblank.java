public class IsEmptyVSIsblank {
    public static void main(String[] args) {
        String isEmpty = "   ";
        boolean b1 = isEmpty.isEmpty();
        System.out.println("isEmpty.isEmpty() is " + b1);
        boolean b2 = isEmpty.isBlank();
        System.out.println("isEmpty.isBlank() is " + b2);

        String isBlank = "";
        boolean b3 = isBlank.isEmpty();
        System.out.println("isBlank.isEmpty() is " + b3);
        boolean b4 = isBlank.isBlank();
        System.out.println("isBlank.isBlank() is " + b4);





    }
}
