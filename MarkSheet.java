import java.util.Scanner;

public class MarkSheet{

	public static void main(String[] args){

		int s1,s2,s3,per;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 numbers: ");
		s1 = sc.nextInt();
		s2 = sc.nextInt();
		s3 = sc.nextInt();
		
		per = (s1+s2+s3)/3;
   
		if(per>90){
			System.out.println("You got AA grade");
		}
		else if(per>80 && per<=90){
			System.out.println("You got AB grade");
		}
		else if(per>70 && per<=80){
			System.out.println("You got BB grade");
		}
		else if(per>60 && per<=70){
			System.out.println("You got BC grade");
		}
		else if(per>50 && per<=60){
			System.out.println("You got CC grade");
		}
		else{
			System.out.println("You got FF grade. You Fail!!");
		}
	}

}