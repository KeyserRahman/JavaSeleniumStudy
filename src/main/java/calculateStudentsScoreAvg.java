import java.util.ArrayList;
import java.util.Scanner;

public class calculateStudentsScoreAvg {
	public static double getStudentScoreAvg(ArrayList<Double> list) {
		double avg = 0.0;
		double sumScores = 0.0;
		if(list.isEmpty()){
			System.out.println("No Average Student Score To Export");
			System.exit(0);
		}
		else {
			for(int j = 0; j < list.size(); j++) {
				sumScores += list.get(j);
			}
			avg = sumScores / list.size();
			
		}
		return avg;
			}
    
	public static void main(String[] args) {
		System.out.println("Do you have student score to input? 'Yes' press 1, 'No' press 0, then press 'Enter'");
		Scanner scanHave = new Scanner(System.in);		
		int i = scanHave.nextInt();
		ArrayList<Double> list = new ArrayList<Double>();
		if (i == 0) {
			System.out.println("You do not have student score to input, see you next time.");
			scanHave.close();
		}
		if (i != 1 & i != 0) {
			System.out.println("You input an invalid number, 'Yes' press 1; 'No' press 0, then press 'Enter'");
		}
		while(i == 1) {
			System.out.println("Please enter student score");
			Scanner scanScore = new Scanner(System.in);
			double score = scanScore.nextDouble();
		    list.add(score);
		    System.out.println("Do you have student score to input? yes press 1; otherwise press 0, then press enter");
			//Scanner scanHaveLoop = new Scanner(System.in);		
			i = scanHave.nextInt();
			System.out.println(list);			
			};
			scanHave.close();
			
					
		System.out.println(String.format("The Avarage Score of the Students is : "   +  "%,.1f", getStudentScoreAvg( list)));
		}

}
