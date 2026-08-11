class perfectnum
{
	public static void main(String[] args) 
	{
		System.out.println(perfect(6,3,0));
	}
	public static boolean perfect(int n,int i,int sum) 
	{
		if(i==0)return n==sum;
		if(n%i==0){
		sum+=i;
		}
		return perfect(n,i-1,sum);
	}
}

