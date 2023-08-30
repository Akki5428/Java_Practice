public class FinalObj{

	int rno;
	String name;
	int std;

	public static void main(String args[]){
		final FinalObj s = new FinalObj();
		System.out.println("s..."+s);

		s = new FinalObj();
		System.out.println("s..."+s);

		s = new FinalObj();
		System.out.println("s..."+s);
	}

}