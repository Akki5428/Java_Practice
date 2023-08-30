import java.util.Scanner;

public class Aray{

	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		int i;
		int a[] = new int[5]; // ways : int[] a,int [] a,int []a 
		System.out.println("Array Size: "+a.length);
		
		for(i=0;i<a.length;i++){
			System.out.println("Enter A[" + i + "] : ");
			a[i] = sc.nextInt();
		}
		
		
		for(i=0;i<a.length;i++){
			System.out.println("A[" + i + "] : "+a[i]);
		}
		
	}

}