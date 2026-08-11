class primepalindromerange 
{
	public static void main(String[] args) 
	{
		range(1,1000);
	}
	public static void range(int st,int end) 
	{
		if(st>end) return;
		if(isprimepalindrome(st))System.out.println(st);
		range(st+1,end);
	}
	public static boolean isprimepalindrome(int n)
	{
		return isprime(n,n/2)&&ispalindrome(n,n,0);
	}
	public static boolean ispalindrome(int n,int m,int rev)
	{
		if(n==0)return m==rev;
		return ispalindrome(n/10,m,rev=rev*10+n%10);
	}
	public static boolean isprime(int n,int i)
	{
		if(i==1)return true;
		if(n<=1||n%i==0) return false;
		return isprime(n,i-1);
	}
}
