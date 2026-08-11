class primerange 
{
	public static void main(String[] args) 
	{
		range(1,100);
	}
	public static void range(int st,int end){
		if(st>end)return;
		if(isprime(st))System.out.println(st);
		range(st+1,end);
	}
	public static boolean isprime(int n){
		return isprime(n,n/2);
	}
	public static boolean isprime(int n,int i){
		if(i==1)return true;
		if(i<=1||n%i==0)return false;
		return isprime(n,i-1);
	}
}
