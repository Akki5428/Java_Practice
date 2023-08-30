public class Emp{

	int id;
	String name;
	int salary;
	String dsgn;
	String orgname;
	public static void main(String args[]){

		Emp e1 = new Emp();
		e1.id = 1;
		e1.name = "Akshat";
		e1.salary = 100000;
		e1.dsgn = "25-12-22";
		e1.orgname = "Royal";		
		System.out.println(e1.id + " " + e1.name + " " + e1.salary + " " + e1.dsgn + " " + e1.orgname);

		Emp e2 = new Emp();
		e2.id = 2;
		e2.name = "Hardik";
		e2.salary = 50000;
		e2.dsgn = "10-01-22";
		e2.orgname = "ABP";		
		System.out.println(e2.id + " " + e2.name + " " + e2.salary + " " + e2.dsgn + " " + e2.orgname);

		Emp e3 = new Emp();
		e3.id = 3;
		e3.name = "Nacool";
		e3.salary = 60000;
		e3.dsgn = "01-01-22";
		e3.orgname = "Discovery";		
		System.out.println(e3.id + " " + e3.name + " " + e3.salary + " " + e3.dsgn + " " + e3.orgname);

		Emp e4 = new Emp();
		e4.id = 4;
		e4.name = "Aayush";
		e4.salary = 70000;
		e4.dsgn = "28-02-22";
		e4.orgname = "ABC";		
		System.out.println(e4.id + " " + e4.name + " " + e4.salary + " " + e4.dsgn + " " + e4.orgname);

		Emp e5 = new Emp();
		e5.id = 5;
		e5.name = "Dhruv";
		e5.salary = 80000;
		e5.dsgn = "25-08-22";
		e5.orgname = "GSA";		
		System.out.println(e5.id + " " + e5.name + " " + e5.salary + " " + e5.dsgn + " " + e5.orgname);
	}
	

}