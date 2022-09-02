abstract class Vehicle{
		public  abstract int getNoOfWheels();
		}
class Bus extends Vehicle{
	public int getNoOfWheels() {
		return 6;
	}
}
class Car extends Vehicle{
	public int getNoOfWheels() {
		return 4;
	}
}
class Auto extends Vehicle{
	public int getNoOfWheels() {
		return 3;
	}
}
public class abstractClassExample {
	public static void main(String[] args) {
		Bus b = new Bus();
		System.out.println("number of wheels of Bus is " + b.getNoOfWheels());
		Car c = new Car();
		System.out.println("number of wheels of Car is " + c.getNoOfWheels());
		Auto a = new Auto();		
		System.out.println("number of wheels of Auto is " + a.getNoOfWheels());
	}

}
