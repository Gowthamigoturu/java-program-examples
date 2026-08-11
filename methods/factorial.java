class factorial 
{
	public static void main(String[] args) 
	{
		fact(5,1);
	}
	public static void fact(int n,int result) 
	{
		if(n==0||n==1)
		System.out.println(result);
		else{
			fact(n-1,n*result);
		}
	}
}
