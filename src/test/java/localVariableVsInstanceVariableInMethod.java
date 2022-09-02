
public class localVariableVsInstanceVariableInMethod {
    int a = 100;
    int m1(int a) {
    	return a;
    	}
    int m2() {
    	return a;
    }
    int m3(int a) {
    	return this.a;
    }
	public static void main(String[] args) {
		localVariableVsInstanceVariableInMethod l = new localVariableVsInstanceVariableInMethod();
		int b = l.m1(10);
		int c = l.m2();
		int d = l.m3(l.a);
		System.out.println("local varible with argument m1 is: " + b);
		System.out.println("local varible without argument m2 is: " + c);
		System.out.println("intance variable Line 3 is: " + l.a);
        System.out.println("force to use instance varible m3 is: " + d);
	}

}
