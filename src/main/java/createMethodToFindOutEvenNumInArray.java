import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class createMethodToFindOutEvenNumInArray {
	public static void findEvenNum(int arr[]) {
		List<Integer> evenNums = new LinkedList<Integer>();
		for (int i = 0; i < arr.length; i++) {
    		if (arr[i]%2 == 0) {
    			//for(int j = 0; j < arr.length; j++) {
    				evenNums.add(arr[i]);
    			//}      			  			
    			//continue;
    		     }     		
    	 } 
		System.out.println("the even numbers you try to find in the array is : " 
    	 + Arrays.toString(evenNums.toArray()));
    	}
	    public static void main(String[] args) {
	    	int[] arr = {9,5,8,2,7,0,6,3,1,0,4};
			System.out.println("Array is : " + Arrays.toString(arr));
			findEvenNum(arr);
		}
}
