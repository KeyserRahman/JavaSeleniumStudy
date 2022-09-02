import java.util.Arrays;

public class creatMethodTofindCertainElementInArray {
    public static void findElement(int arr[], int x) {
    	for (int i = 0; i < arr.length; i++) {
    		int p = 0;
			if (arr[i] == x) {
    			p  = i + 1;
    			System.out.println("the element you try to look for is on pisition " + p
                        + " in the array");
    			continue;
    		     }    		
    	 }   	
    }
	
    public static void main(String[] args) {
		int[] arr = {9,5,8,2,7,0,6,3,1,0,4};
		int x = 0;
		findElement(arr, x);
        System.out.println("Array is : " + Arrays.toString(arr));
	}

}
