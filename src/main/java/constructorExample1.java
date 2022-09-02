
public class constructorExample1 {
    int empId;
    String empName;
    double empSal;
    constructorExample1() {
    	empId = 111;
    	empName = "Sani";
    	empSal = 1000.5;
    }
    void display() {
    	System.out.println("emp id is: " + empId);
    	System.out.println("emp name is: " + empName);
    	System.out.println("emp salary is: " + empSal);
    }
	public static void main(String[] args) {
		constructorExample1 c = new constructorExample1();
       c.display();
	}

}
