class spynum
{
	public static void main(String[] args) 
	{
		System.out.println(spy(123,0,1));
	}
	public static boolean spy(int n, int sum, int prod) 
	{
		if(n==0)return sum==prod;
		n=n%10;
		sum+=n;
		prod*=n;
		return spy(n/10,sum,prod);
	}
}
