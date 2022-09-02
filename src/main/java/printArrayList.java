//import java.util.ArrayList;
//import java.util.Arrays;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class printArrayList {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>(Arrays.asList("ar", "cd"));
		//ArrayList<Integer> Nums =  Arrays.asList(1,2,3,4);
		List<Integer> listOfInts = Arrays.asList(1, 2, 3);
//		listOfInts.add(3, 4);
//		listOfInts.remove(0);
		System.out.println(Arrays.toString(listOfInts.toArray()));
		//list.forEach(System.out::println);
		list.forEach(System.out::println);
	}

}
