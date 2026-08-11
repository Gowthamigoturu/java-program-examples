class fibonacci 
{
	public static void main(String[] args) 
	{
		int n=5;
		System.out.println(is_fibonacci(n));
	}
	public static int is_fibonacci(int n){
		int a=0;
		int b=1;
		for(int i=3;i<=n;i++){
			int c=a+b;
			a=b;
			b=c;
		}
		return a;
	}
}
