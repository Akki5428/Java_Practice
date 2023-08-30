import java.util.Scanner;

public class HotelMenu{

	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		int price,qty,choice;

		System.out.println("1 for Gujarati Dish.Price : 90rs.");
		System.out.println("2 for Marathi Dish.Price : 100rs.");
		System.out.println("3 for Chinese Dish.Price : 100rs.");
		System.out.println("4 for SouthIndian Dish.Price : 110rs.");
		System.out.println("Enter your Dish number : ");
		choice = sc.nextInt();
		
		switch(choice)
		{
			case 1 : System.out.println("You select Gujarati Dish! How many Quantity do you need:");
				qty = sc.nextInt();
				price = qty * 90;
				System.out.println("Total amount: "+price);
				break;
			case 2 : System.out.println("You select Marathi Dish! How many Quantity do you need:");
				qty = sc.nextInt();
				price = qty * 100;
				System.out.println("Total amount: "+price);
				break;
			case 3 : System.out.println("You select Chinese Dish! How many Quantity do you need:");
				qty = sc.nextInt();
				price = qty * 100;
				System.out.println("Total amount: "+price);
				break;
			case 4 : System.out.println("You select South Indian Dish! How many Quantity do you need:");
				qty = sc.nextInt();
				price = qty * 110;
				System.out.println("Total amount: "+price);
				break;
			default: System.out.println("Wrong number!please select given number in the menu...");
		
		
		}
		

}

}