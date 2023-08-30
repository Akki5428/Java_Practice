public class Employee{

	int id;
	String name;
	int salary;
	String dsgn;
	String orgname;

	public Employee()
	{
		System.out.println("Default Constructor");
	}	

	public Employee(int id,String name,int salary)
	{
		this.id = id;
		this.name = name;
		this.salary = salary;	
	}	

	public Employee(int id,String name,int salary,String dsgn,String orgname)
	{
	 	this(id,name,salary);
		this.dsgn = dsgn;
		this.orgname = orgname; 
	}

	public Employee(Employee e)
	{
		this.id = e.id;
		this.name = e.name;
		this.salary = e.salary;
		this.dsgn = e.dsgn;
		this.orgname = e.orgname;
	}

	public void disp(){
		System.out.println(id +" " + name + " "+salary + " "+ dsgn + " "+orgname );
	}
	
	public static void main(String args[]){
		Employee e = new Employee(12,"Akshat",200000,"Manager","ABP");
		e.disp();
	
	} 

}