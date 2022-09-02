
public class NoMethodTofindElementInArray {

	public static void main(String[] args) {
		int[] arr = {9,5,8,2,7,0,6,3,1,4};
		int x = 8;
		for (int i = 0; i < arr.length; i++) {
    		if (arr[i] == x) {
    			System.out.println(i + 1);;
    		}
    		
    	}

	}

}
