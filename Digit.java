import java.util.Scanner;

class Digit{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n,count=0;
		int temp;
		System.out.println("Enter a number:");
		n = sc.nextInt();
		temp = n;
		while(temp>0){
			count++;
			temp = temp / 10;
		}
		System.out.println("Digit Number: "+count);
	}
}