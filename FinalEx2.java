public class FinalEx2{
	//DM final varibale
	final int no;//=100

	FinalEx2(){
		no = 100;
	}

	FinalEx2(int no){
		this.no = no;
	}

	public static void main(String args[]){
		FinalEx2 f = new FinalEx2(200);

		System.out.println("No: "+f.no);
	}

}