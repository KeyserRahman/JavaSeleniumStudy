
public class switchWorkFlow1 {

	public static void main(String[] args) {
		//int x = 0;   ===> 0
		//int x = 1;   ===> 1, 2
		//int x = 2;   ===> 2
		int x = 3;   //===> default, 0
		switch(x) {
		default:
			System.out.println("default");
		case 0:
			System.out.println("0");
			break;
		case 1:
			System.out.println("1");
		case 2:
			System.out.println("2");
		}

	}

}
