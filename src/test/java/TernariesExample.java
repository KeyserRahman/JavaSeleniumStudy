
public class TernariesExample {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int max = 0;
		if(a > b) {
			max = a;
		}else if(a == b){
			max = b;
		}else {
			
		}
		System.out.println(max);
		
		int max2 = (a > b)? a : b;
		System.out.println(max2);
	}

}
