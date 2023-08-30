class Counter{

	static int counter = 0;	

	public Counter()
	{	
		counter++;
	}	

	public static void main(String args[]){

		Counter e1 = new Counter();
		Counter e2 = new Counter();
		Counter e3 = new Counter();
		Counter e4 = new Counter();
		Counter e5 = new Counter();
		
		System.out.println("Total Objects: "+ Counter.counter); 		

	}

}