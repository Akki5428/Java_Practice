import java.util.Scanner;

public class EmpArray{

	int id;
	String name;
	double salary;
	String orgname;
	String dsgn;
	String address; 

	public void Scandata(){
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("Enter ID: ");
		id = sc.nextInt();
		sc.nextLine();    
		System.out.println("Enter Name : ");
		name = sc.nextLine();	
		System.out.println("Enter Salary : ");
		salary = sc.nextDouble();
		sc.nextLine();

		System.out.println("Enter Organization Name: ");
		orgname = sc.nextLine();	
		System.out.println("Enter Designation: ");
		dsgn = sc.nextLine();
		System.out.println("Enter Address: ");
		address = sc.nextLine();	
	

	}		

	public void Dispdata(){
		System.out.println(id + " " + name + " " + salary +" "+ orgname + " " + dsgn + " " + address);
	}

	public static void main(String args[]){
	
		EmpArray e[] = new EmpArray[5];

		for(int i = 0;i < e.length ; i++){
			e[i] = new EmpArray();
			e[i].Scandata();	
		}
		for(int i = 0;i < e.length ; i++){
			e[i].Dispdata();	
		}
		
	}

}