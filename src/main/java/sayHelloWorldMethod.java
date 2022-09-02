public class sayHelloWorldMethod {
    public static void main(String[] args) {
        sayHelloWorldMethod s = new sayHelloWorldMethod();
        s.run();
    }
    private void run(){
       sayHello();
    }
    public void sayHello(){
        System.out.println("sayHelloWorld");
    }
}
