public class ThisConst{

	int rno;
	String name;
	int std;

	public ThisConst(){
		System.out.println("Default Constructor");
	}

	public ThisConst(int rno,String name){
		this();
		System.out.println("TWO-PARA Constructor");
		this.rno = rno;
		this.name = name;
	}

	public ThisConst(int rno,String name,int std){
		this(rno,name);
		System.out.println("THREE-PARA Constructor");
		this.std = std;
	}	

	public void disp(){
		System.out.println(rno+" "+name+" "+std);
	}

	public static void main(String args[]){
		ThisConst s1 = new ThisConst(1,"Akshat",12);

		s1.disp();
	}
} 