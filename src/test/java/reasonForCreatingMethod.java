
public class reasonForCreatingMethod {
	int add(int a, int b) {
		
		return a+b;
	}
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		reasonForCreatingMethod r = new reasonForCreatingMethod();
		System.out.println("In main method is  " + r.add(a, b));
		
		}

	}


