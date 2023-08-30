import java.util.*;

class RbiBank{

	public int getroi(){
			
		}
}

class Twvehicle extends Vehicle{

	public int getspec(){
		System.out.println("Twvehicle -getspec()");
		}
}

class Lmvvehicle extends Vehicle{

	public int getspec(){
		System.out.println("Lmvvehicle -getspec()");
		}
}

class Hmvvehicle extends Vehicle{

	public int getspec(){
		System.out.println("Hmvehicle -getspec()");
		}
}


public class TestVehicle2{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
	
		System.out.println("1...for Two Whelier Vehicle");
		System.out.println("2...for LMV(CAR) Vehicle");
		System.out.println("3...for HMV(Heavy TRUCK) Vehicle");

		int choice = sc.nextInt();

		Vehicle vehicle = null;

		switch(choice){
			case 1 : vehicle = new Twvehicle();
				 vehicle.getspec();
			 	break;
			case 2 : vehicle = new Lmvvehicle();
			 	vehicle.getspec();
			 	break;
			case 3 : vehicle = new Hmvvehicle();
				 vehicle.getspec();
			 	break;
		} 
	}

}