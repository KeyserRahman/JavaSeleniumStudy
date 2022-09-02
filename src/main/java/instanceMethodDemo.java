
public class instanceMethodDemo {

	public static void main(String[] args) {
		instanceMethodDemo i = new instanceMethodDemo();
		String name = i.getData();
        System.out.println(name);
        accessFromOutSideOfInstanceMethodDemo a = new accessFromOutSideOfInstanceMethodDemo();
        System.out.println(a.getUserData());
	}
	public String getData() {
		System.out.println("Hello");
		return("Rahman");
	}

}
