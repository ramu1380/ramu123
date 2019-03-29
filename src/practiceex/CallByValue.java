package practiceex;

public class CallByValue 
{
	
	static int p=30;
	static int q=90;
	

	public static void main(String[] args) 
	{
		
		CallByValue c=new CallByValue();
		c.test(p,q);
		System.out.println(p+ " "+q);
		c.swap(c);

		System.out.println(p+ " "+q);
		
	

	}





	private void swap(CallByValue c) {
		// TODO Auto-generated method stub
		c.p=2;
		c.p=8;
		
	}





	private void test(int p2, int q2) {
		// TODO Auto-generated method stub
		p=234;
		q=8676;
		
	}





	private static void sum(int x, int y) 
	{
		// TODO Auto-generated method stub
		x=67;
		y=90;
	}

}