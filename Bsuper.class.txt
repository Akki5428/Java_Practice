public class Asuper{
	int no;
}

class Bsuper extends Asuper{
	int no;

	public void test(){
		no = 10;
		super.no = 100;
		System.out.println("NO : "+no);
		System.out.println("SUPER.NO : "+super.no);
	}
	public static void main(String args[]){
		B s1 = new B();
		
		s1.test();
	}
}

