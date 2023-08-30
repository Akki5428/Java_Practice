public class StuThis{

	private int rno;
	private String name;
	private int std;

	public StuThis(int rno,String name,int std){
		this.rno = rno;
		this.name = name;
		this.std = std;
	}

	public void disp(){
		System.out.println(rno+" "+name+" "+std);
	}

}
