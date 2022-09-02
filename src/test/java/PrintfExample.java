public class PrintfExample {
    public static void main(String[] args) {
        String name = "keyser";
        int age = 50;
        double balance = 123.45;
        System.out.printf("Hello %s!\n",name);
        System.out.printf("you are %d years old.\n", age);
        System.out.printf("your current balance is $%.2f.\n", balance);
        System.out.printf("Hello %s! you are %d years, your current balance is $%.2f.", name, age, balance);
    }
}
