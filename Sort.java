import java.util.Scanner;

public class Sort{

	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		int i,temp;
		int a[] = new int[5]; 
		System.out.println("Array Size: "+a.length);
		
		System.out.println("Enter 5 Numbers: ");
		for(i=0;i<a.length;i++){
			a[i] = sc.nextInt();
		}
		
		System.out.println("Before sorting: ");
		for(i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
		
		
		for(i=0;i<(a.length-1);i++)
		{
			for(int j=0;j<(a.length-1);j++)
			{
				if(a[j]>a[j+1])
				{
					temp = a[j+1];
					a[j+1] = a[j];
					a[j] = temp;
				}
			}
		}		

		System.out.println("After sorting: ");
		for(i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
		
	}

}