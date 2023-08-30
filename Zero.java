import java.util.Scanner;

public class Zero{

	public static void main(String[] args){

		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n: ");
		n = sc.nextInt();
		
		if(n>0){
			System.out.println(n+" is positive...");
		}
		else if(n==0){
			System.out.println(n+" is Zero...");
		}
		else{
			System.out.println(n+" is negative...");
		}
	}

}