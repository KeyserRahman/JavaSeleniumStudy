
public class switchOnByte {

	public static void main(String[] args) {
		byte b = 10;
		//switch(b) does not work for case 1000; out of range of byte.  -128 to 127
		switch(b+1) {
		case 11:
			System.out.println("11 is printed");
			break;
		case 101:
			System.out.println("101 is printed");
			break;
		case 1001:
			System.out.println("1001 is printed");
			break;
		}

	}

}
