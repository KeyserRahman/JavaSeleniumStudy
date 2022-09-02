
public class switchMultibleCaseStatementWithOneMatchValue {

	public static void main(String[] args) {
		int x = 4;
		switch(x) {
		case 1:
		case 2:
		case 3:
			System.out.println("match 1, 2, 3");
			break;
		case 4:
		case 5:
		case 6:
			System.out.println("match 4, 5, 6");
			break;
		
		}

	}

}
