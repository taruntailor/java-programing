package oops;

class calc{
	 
	public  void show()
	{
		System.out.println("running method show");
		
	}
	
	public void name (String name) {
		System.out.println("my name "+name);
	}
	
	public void add(int a, int b)
	{
	 System.out.println(a+b);
	}
	
	public void add(int a, int b)
	{
	 System.out.println(a+b);
	}
	public int sqare(int a)
	{
		int sq = a*a;	
		return sq;
	}
	
	public String message()
	{
		return "hello...";
	}
	
	public void addArray(int a[])
	{
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum+=a[i];
		}
		System.out.println("sum of array : "+sum);
	}
	
	public void revArray() {
		
	}

	
	
	
}



public class mathod_multi {
	public static void main(String[] args) {
		calc c = new calc();
		c.show();
		c.add(23,50);
		c.name("ronny");
		
		int square =  c.sqare(10);
		int square1 = c.sqare(11);
		System.out.println(c.sqare(55));
		

		String str = c.message();
		
		
		
		System.out.println(str);
		int a[] = {10,20,30,40,50,60};
		int b[] = {1,2,3,4,5,6};
		c.addArray(a);
		c.addArray(b);
		
		
		

	}

}
