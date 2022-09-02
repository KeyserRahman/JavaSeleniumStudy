
public class MethodDemo3 {
    int m1() {
    	System.out.println("int method m1");
    	return 10;
    }
    float m2() {
    	System.out.println("float method m2");
    	return 10.5f;
    }
    static char m3() {
    	System.out.println("char static method m3");
    	return 'a';
    }
	public static void main(String[] args) {
		MethodDemo3 m = new MethodDemo3();
		int x = m.m1();
		System.out.println("Return Value of m1 is: " + x);
		float f = m.m2();
		System.out.println("Return Value of m2 is: " + f);
		char ch = MethodDemo3.m3();
		System.out.println("Return Value of m3 is: " + ch);
	}

}
