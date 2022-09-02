
public class callingStaticMethodInInstanceMethod {
    public static int m1() {
    	//System.out.println("called by c.m1");
    	return 0;
    }
    public void m2() {
    	//we can directly call static method in instance method if they are in same class
    	m1();
    	//we can also call static method by className.MethodName() f they are in same class;
    	callingStaticMethodInInstanceMethod.m1();
    	// calling static method by object in instance method looks like have problem f they are in same class 
    	callingStaticMethodInInstanceMethod c2 = new callingStaticMethodInInstanceMethod();
    	c2.m1();
    	
    }
	public static void main(String[] args) {
		callingStaticMethodInInstanceMethod c1 = new callingStaticMethodInInstanceMethod();	
		c1.m2();
		//directly call static method m1() in static main method
		m1();
	}

}
