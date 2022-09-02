
public class switchNeedConstantOrFinalVariable {

	public static void main(String[] args) {
		int x = 10;
		//int y = 20;
		final int y = 20;
		switch(x) {
		case 10:
			System.out.println("10 is printed");
			break;
		case y:
			System.out.println("20 is printed");
			break;
		}

	}

}
