import java.util.*;

public class MethodOverloadrule3{

	public void add(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no1:");
		int no1 = sc.nextInt();		
		System.out.println("Enter no2:");
		int no2 = sc.nextInt();
		
		int ans = no1+no2;
		System.out.println("(Zero Argument) no1+no2= "+ans);
	}

	public void add(float no1,float no2){
		float ans = no1+no2;
		System.out.println("(Two Argument) no1+no2= "+ans);	
	}
	
	public void add(int no1,int no2,int no3){
		int ans = no1+no2+no3;
		System.out.println("(Three Argument) no1+no2+no3= "+ans);	
	}
	
	public void add(double no1,double no2){
		double ans = no1+no2;
		System.out.println("(Two argument with double) no1+no2= "+ans);	
	}

	public static void main(String args[]){
		MethodOverlod a = new MethodOverlod();

		a.add();
		a.add(10,20);
		//a.add(12.24,10.23);
		a.add(10,20,30);
	}

}