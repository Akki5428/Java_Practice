import java.util.Scanner;

public class UserCalc{

	public static void main(String[] args){

	int a,b,sum,mul,div,sub;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a: ");
	a = sc.nextInt();
	System.out.println("Enter b: ");
	b = sc.nextInt();
	sum = a+b;
	sub = a-b;
	mul = a*b;
	div = a/b;
	System.out.println("a: "+a);
	System.out.println("b: "+b);
	System.out.println("Sum: "+sum);
	System.out.println("Subtraction: "+sub);
	System.out.println("Multiplication: "+mul);
	System.out.println("Division: "+div);
	

}

}