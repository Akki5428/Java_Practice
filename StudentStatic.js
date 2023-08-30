import java.util.Scanner;

public class StudentStatic{

	int rno;
	String name;
	int std;
	static String schoolname;

	public static void setschoolname(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter School Name: ");
		schoolname = sc.nextLine();
	}
	
	public void scan(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Roll no: ");
		rno = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name: ");
		name = sc.nextLine();
		System.out.println("Enter STD: ");
		std = sc.nextInt();
		sc.nextLine();
	}

	public void disp(){
		System.out.println(rno + " " +name +" "+ std+" "+schoolname);
	}

	public static void main(String args[]){
		StudentStatic s[] = new StudentStatic[2];
		for(int i=0;i<s.length;i++){
			StudentStatic s[i] = new StudentStatic();
			s[i].scan();
		}
		for(int i=0;i<s.length;i++){
			s[i].disp();
		}
	}

}