
public class accessMethod {

	public static void main(String[] args) {
		accessMethod a = new accessMethod();
		a.getData();

	}
    public void getData() {
    	System.out.println("Access Non-Static Method");
    }
    static int num;
    static int staticMethod() {
    	return num;
    }
}
