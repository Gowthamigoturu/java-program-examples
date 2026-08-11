class tribonacci 
{
	public static void main(String[] args) 
	{
		int n=10;
		System.out.println(is_tribonacci(n));
	}
	public static int is_tribonacci(int n){
		int a=0;
		int b=1;
		int c=1;
		int d=0;
		for(int i=1;i<=n;i++){
			d=a+b+c;
			a=b;
			b=c;
			c=d;
		}
		return c;
	}
}
