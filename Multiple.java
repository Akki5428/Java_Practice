public class A{

	public void a(){
		System.out.println("A-----a()");
	}

}

public class B{

	public void a(){
		System.out.println("B-----()");

	}

}

public class C extends A,B{

	public void c(){
		System.out.println("C-----c()");
	}

}


public class Multiple{

	public static void main(String args[]){
		C obj = new C();
		obj.a();
	} 

}