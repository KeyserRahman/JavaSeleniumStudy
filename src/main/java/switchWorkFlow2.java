
public class switchWorkFlow2 {

	public static void main(String[] args) {
		        //within the switch statement, 
		        //if any case default matched, 
		        //from the case onwards, 
		        //all these of the statements will be executed.
		        //until "break" on the switch statement.
		        //// this is called for-through inside the switch.
		        //int x = 0;   ===> 0, 1
				//int x = 1;   ===> 1
				//int x = 2;   ===> 2, default
		        //int x = 3;   ===> default
		        int x = 0;   
				switch(x) {
				case 0:
					System.out.println("0");
				case 1:
					System.out.println("1");
					break;
				case 2:
					System.out.println("2");
				default:
					System.out.println("default");	
				}

	}

}
