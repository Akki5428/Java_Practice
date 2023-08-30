import java.util.Scanner;

class LdFd{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n,LD,FD;
		int temp;
		System.out.println("Enter a number:");
		n = sc.nextInt();
		LD = n % 10;
		do{
			FD = n;
			n = n / 10;
		}while(n>0);
		System.out.println("Sum : "+(FD+LD));
	}
}