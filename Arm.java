import java.util.Scanner;

class Arm{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n,count=0,sum=0,temp,num,newnum,newn,poww;
		int mul;
		System.out.println("Enter a number:");
		n = sc.nextInt();
		temp = n;
		while(temp>0){
			count++;
			temp = temp / 10;
		}
		num = count;
		newn = n;
		while(count>0){
			newnum = newn % 10;
			poww = num;
			mul = 1;
			while(poww>0){
				mul = mul * newnum;
				poww--;
				
			}
			sum = sum + mul;
			newn = newn/ 10;  
			count--;
			
		}
		if (n == sum){
			System.out.println(n+" is Armstrong number...");
		}
		else{
			System.out.println(n+" is non-Armstrong number...");
		}
		
		
	}


}