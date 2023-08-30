import java.util.*;

class Vehicle{

	public void getspec(){
		System.out.println("Vehicle -getspec()");
		}
}

class Twvehicle extends Vehicle{

	public void getspec(){
		System.out.println("Twvehicle -getspec()");
		}
}

class Lmvvehicle extends Vehicle{

	public void getspec(){
		System.out.println("Lmvvehicle -getspec()");
		}
}

class Hmvvehicle extends Vehicle{

	public void getspec(){
		System.out.println("Hmvehicle -getspec()");
		}
}


public class TestVehicle{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
	
		System.out.println("1...for Two Whelier Vehicle");
		System.out.println("2...for LMV(CAR) Vehicle");
		System.out.println("3...for HMV(Heavy TRUCK) Vehicle");

		int choice = sc.nextInt();

		switch(choice){
			case 1 : Twvehicle twuser = new Twvehicle();
				 twuser.getspec();
			 	break;
			case 2 : Lmvvehicle lmvuser = new Lmvvehicle();
			 	lmvuser.getspec();
			 	break;
			case 3 : Hmvvehicle hmvuser = new Hmvvehicle();
				 hmvuser.getspec();
			 	break;
		} 
	}

}