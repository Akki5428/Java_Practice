import java.util.Scanner;

public class CalcSwitch{

	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		int ans,a,b,choice;
		System.out.println("Enter a: ");
		a = sc.nextInt();
		System.out.println("Enter b: ");
		b = sc.nextInt();
		
		System.out.println("1 for Addition.");
		System.out.println("2 for Subtraction.");
		System.out.println("3 for Multiplication.");
		System.out.println("4 for Divison.");
		System.out.println("Enter Choice: ");
		choice = sc.nextInt();
		

		switch(choice){
			case 1 : ans = a+b;
				System.out.println("Addition: "+ans);
				break;

			case 2 : ans = a-b;
				System.out.println("Subtraction: "+ans);
				break;
			
			case 3 : ans = a*b;
				System.out.println("Multiplication: "+ans);
				break;
		
			case 4 : ans = a/b;
				System.out.println("Divison: "+ans);
				break;
				
			default : System.out.println("Wrong Choice! Enter choice between 1 to 4");
		
		}			

	}

}