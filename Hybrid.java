public class A{

	public void a(){
		System.out.println("A-----a()");
	}

}

public class B extends A{

	public void b(){
		System.out.println("B-----b()");

	}

}

public class C extends A{

	public void c(){
		System.out.println("C-----c()");
	}

}

public class D extends B,C{

	public void d(){
		System.out.println("D-----d()");
	}

}

public class Hybrid{

	public static void main(String args[]){
		D obj = new D();
		obj.c();
	} 

}