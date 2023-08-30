import java.util.Scanner;

class StuStatic{
	
	int rollno;
	String name;
	int std;
	static String sname;

	void scan(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Roll no: ");
		rollno = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name: ");
		name = sc.nextLine();
		System.out.println("Enter STD: ");
		std = sc.nextInt();	
	}

	static void Sname(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter School name: ");
		sname = sc.nextLine();
        }

	void disp(){
		System.out.println("\n"+rollno+" "+ name +" " + std + " " + sname);
	}

	public static void main(String args[]){

		StuStatic s[] = new StuStatic[2];
		
		StuStatic.Sname();
	
		for(int i=0;i<s.length;i++){
			s[i] = new StuStatic();
			s[i].scan();
		}

		for(int i=0;i<s.length;i++){
			s[i].disp();
		}
			

	}

}