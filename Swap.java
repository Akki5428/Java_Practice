public class Swap{

	public static void main(String args[]){

		int a,b,temp;
		a = 10;
		b = 20;
		
		System.out.println("Before Swaping:");
		System.out.println("a: "+a);
		System.out.println("b: "+b);

		temp = a;
		a = b;
		b = temp;

		System.out.println("After Swaping:");
		System.out.println("a: "+a);
		System.out.println("b: "+b);
	}

}