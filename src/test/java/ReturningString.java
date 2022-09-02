public class ReturningString {
    public static void main(String[] args) {
        String s = doSomething();
        System.out.println("Print the value from the function: " + s);
    }

    private static String doSomething() {
        return "Hi,I am in doSomething Function";
    }
}
