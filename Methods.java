import java.util.Scanner;

public class Methods{

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
	
		Methods s1 = new Methods();
		Methods s2 = new Methods();
		Methods s3 = new Methods();

		s1.Scandata();
		s2.Scandata();
		s3.Scandata();

		s1.Dispdata();
		s2.Dispdata();
		s3.Dispdata(); 

	}

}