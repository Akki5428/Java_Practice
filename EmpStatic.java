import java.util.Scanner;

public class EmpStatic{

	int id;
	String name;
	double salary;
	String dsgn; 
	static String orgname;

	public static void setorgname(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Oraganization name: ");
		orgname = sc.nextLine();
	}

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
		System.out.println("Enter Designation: ");
		dsgn = sc.nextLine();	
		}		

	public void Dispdata(){
		System.out.println(id + " " + name + " " + salary +" "+ dsgn+" "+orgname );
	}

	public static void main(String args[]){
	
		EmpStatic.setorgname();
	
		EmpStatic e[] = new EmpStatic[5];

		for(int i = 0;i < e.length ; i++){
			e[i] = new EmpStatic();
			e[i].Scandata();	
		}
		for(int i = 0;i < e.length ; i++){
			e[i].Dispdata();	
		}
		
	}

}