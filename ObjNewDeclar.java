import java.util.Scanner;

public class ObjNewDeclar{

	int rollno;
	String name;
	int std;

	public void Scandata(){
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("Enter Roll No : ");
		rollno = sc.nextInt();
		sc.nextLine();    // it is comp. to write after number if there is  name
		System.out.println("Enter Name : ");
		name = sc.nextLine();	
		System.out.println("Enter STD : ");
		std = sc.nextInt();	
	}		

	public void Dispdata(){
		System.out.println();
		System.out.println(rollno + " " + name + " " + std);
	}

	public static void main(String args[]){
	
		ObjNewDeclar s = null;
		
		s = new ObjNewDeclar(); 
		

		s.Scandata();
		
		s.Dispdata(); 

	}

}