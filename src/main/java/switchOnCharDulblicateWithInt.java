
public class switchOnCharDulblicateWithInt {

	public static void main(String[] args) {
		int x = 97;
		switch(x) {
		case 97:
			System.out.println("97 is printed");
			break;
		case 98:
			System.out.println("98 is printed");
			break;
		case 99:
			System.out.println("99 is printed");
			break;
		//invalid: because 'a' means 97, dublicate 
//			case 'a':
//			System.out.println("'a' is printed");
//			break;
		}

	}

}
