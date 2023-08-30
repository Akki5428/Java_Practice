public class FinalClass
{
	public  class A{
	
		public void test1(){
			System.out.println("A---test1()");
		}

	}

	public final class B extends A{

		public void test1(){
			System.out.println("B---test1()");
		}


	}

	public class C extends B{

		public void test1(){
			System.out.println("C---test1()");
		}


	}
}