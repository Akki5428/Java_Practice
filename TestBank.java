import java.util.*;

class RbiBank{

	public int getRoi(){
			return 0;
		}
}

class AxisBank extends RbiBank{

	public int getRoi(){
			return 10;
		}
}

class BankofBaroda extends RbiBank{

	public int getRoi(){
			return 12;
		}
}

class KotakBank extends RbiBank{

	public int getRoi(){
			return 8;
		}
}

public class TestBank{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1...for AxisBank");
		System.out.println("1...for BankofBaroda");
		System.out.println("1...for KotakBank");

		RbiBank roi = null;

		int choice = sc.nextInt();
		switch(choice){
			case 1: roi = new AxisBank();
				int interst = roi.getRoi();
				System.out.println("interst: "+interst);
				break;
		
			case 2: roi = new BankofBaroda();
				interst = roi.getRoi();
				System.out.println("interst: "+interst);
				break;
			
			case 3: roi = new KotakBank();
				interst = roi.getRoi();
				System.out.println("interst: "+interst);
				break;
		}
	}
}




