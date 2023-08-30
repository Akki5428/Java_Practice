import java.util.*;

public class SInherit extends Empdata{

	int bonus;
		
	void scan(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ID: ");
		id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name: ");
		name = sc.nextLine();
		System.out.println("Enter Salary: ");
		sal = sc.nextInt();
		System.out.println("Enter Bonus: ");
		bonus = sc.nextInt();
 
	}
	
	void disp(){
		System.out.println("\n"+ id+" "+name+" "+sal+" "+bonus);
	}

	public static void main(String args[]){

		SInherit obj  = new SInherit();
		obj.scan();
		obj.disp();
	}

}