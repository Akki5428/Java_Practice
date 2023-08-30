class Const{

	int rno;
	String name;
	int std;
	
	Const(){
	   	System.out.println("STARTING : Default Constructor:");
	   	System.out.println(rno+ " "+ name + " "+ std);
		
		rno = 1;
		name = "Akshat";
		std = 10;
		System.out.println(rno+ " "+ name + " "+ std);
		System.out.println("ENDING : Default Constructor:");
	} 

	Const(int r,String n, int s){
		System.out.println("STARTING : Parameter Constructor:");
	   	System.out.println(rno+ " "+ name + " "+ std);
		
		rno = r;
		name = n;
		std = s;
		System.out.println(r+ " "+ n + " "+ s);
		System.out.println("ENDING : Parameter Constructor:");

	}

	Const(Const s){
		System.out.println("STARTING : para/Copy Constructor:");
	   	System.out.println(rno+ " "+ name + " "+ std);
		
		rno = s.rno;
		name = s.name;
		std = s.std;
		System.out.println(rno+ " "+ name + " "+ std);
		System.out.println("ENDING : para/Copy Constructor:");

	}

	void showdetails(){
		System.out.println(rno+ " "+ name + " "+ std + " "+ this);
	
	}

	public static void main(String args[]){
		Const s1 = new Const();
		Const s2 = new Const(2,"Neha",10);
		Const s3 = new Const(s2);

		s1.showdetails();
		s2.showdetails();
		s3.showdetails();

		
	}

}