import java.util.Scanner;

public class Searching{

	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		int i,num,flag=0;
		int a[] = new int[10]; 
		System.out.println("Array Size: "+a.length);
		
		System.out.println("Enter 10 Numbers: ");
		for(i=0;i<a.length;i++){
			a[i] = sc.nextInt();
		}
		
		System.out.println("Enter number you want to Search: ");
		num = sc.nextInt();
		
		for(i=0;i<a.length;i++){
			if(a[i]==num)
			{
				System.out.println(num+" Number found at " +i+ " index.");
				flag = 1;
			}
		}
		if(flag == 0)
		{
			System.out.println(num+" Number not Found");
		}
	}

}