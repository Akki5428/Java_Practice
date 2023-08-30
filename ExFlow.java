public class ExFlow{

	//Execution Flow
	static{
		System.out.println("1>Static Block---1");
	}

	static{
		System.out.println("1>Static Block---2");
	}

	{
		System.out.println("4>Instance Block---2");
	}

	{
		System.out.println("4>Instance Block---1");
	}

	ExFlow(){
		System.out.println("5>Default Constructor");
	}

	ExFlow(int no){
		System.out.println("5>Para Constructor");
	}

	public static void staticMF(){
		System.out.println("3>Static Function or Method");
	}
	
	public void nonstaticMF(){
		System.out.println("6>Non Static Method");
	}

	public static void main(String args[]){
		System.out.println("2>Start Main");
		ExFlow.staticMF();

		ExFlow obj1 = new ExFlow();
		ExFlow obj2 = new ExFlow();
				
		obj1.nonstaticMF();
		System.out.println("7>End Main");
	}
}




//OutPut:-(Execution Flow)

//1>Static block --1
//2>Static block --2
//3>start main
//4>Satic fun or method
//5>Instance block---2
//6>Instance block---1
//7>Default/para Constructor
//8>Non static method
//9>End main


//fromat of Execution Flow:-

//1>Static block
//2>start main method
//3>Satic fun or method
//4>Instance block
//5>Default/para Constructor
//6>Non static method
//7>End main method
