class widening2 
{
	public static void main(String[] args) 
	{
		m1(5);
		m1(2.3f);
		m1('a');
		m1('A');
		m1(5.5);
	}
	public static void m1(double d) 
	{
		System.out.println("double d:" +d);
	}
}
