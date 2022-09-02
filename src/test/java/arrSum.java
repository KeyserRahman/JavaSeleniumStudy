import org.openqa.selenium.json.JsonOutput;

public class arrSum {

	public static void main(String[] args) {
		int[] arr = {1,3,6,8,4,9};
        int sum = 0;
        for(int num : arr) {
        	sum += num;
        }
        System.out.println(sum);
        for(int num : arr) {
	    	if(num % 2 == 0) {
	    		System.out.println(num);
	    	}
	    }

	    }

	}
