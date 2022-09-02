
public class twoWayToCallingStaticMethodInMainMethod {
    public static int s1() {
    	return 0;
    }
    public void i() {
    	//we can also call static method by className.MethodName() f they are not in same class;
    	callingStaticMethodInInstanceMethod.m1();
    	//we can also call static method by creating object if they are not in same class;
    	callingStaticMethodInInstanceMethod c = new callingStaticMethodInInstanceMethod();
//    	int i1 = s1();
//    	System.out.println("i1");
    	int i2 = c.m1();
    	System.out.println("i2");
    }
	public static void main(String[] args) {
		// we can call static method directly static method in same class
		s1();
		// we also can call static method by className.MethodName();
		twoWayToCallingStaticMethodInMainMethod.s1();
		//we can call static method by className.MethodName() if the static method outside of the current class
		callingStaticMethodInInstanceMethod.m1();

	}

}
