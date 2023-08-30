import java.util.Scanner;

public class CalcSwitchChar{

	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		int ans,a,b;
		char choice;
		System.out.println("Enter a: ");
		a = sc.nextInt();
		System.out.println("Enter b: ");
		b = sc.nextInt();
		
		System.out.println("+ for Addition.");
		System.out.println("- for Subtraction.");
		System.out.println("* for Multiplication.");
		System.out.println("/ for Divison.");
		System.out.println("Enter Choice: ");
		choice = sc.next().charAt(0);
		

		switch(choice){
			case '+' : ans = a+b;
				System.out.println("Addition: "+ans);
				break;

			case '-' : ans = a-b;
				System.out.println("Subtraction: "+ans);
				break;
			
			case '*' : ans = a*b;
				System.out.println("Multiplication: "+ans);
				break;
		
			case '/': ans = a/b;
				System.out.println("Divison: "+ans);
				break;
				
			default : System.out.println("Wrong Choice! Enter choice between 1 to 4");
		
		}			

	}

}