class armstrongrange 
{
	public static void main(String[] args) 
	{
		range(1,200);
	}
	public static void range(int st,int end){
		if(st>end)return;
		if(isarm(st))System.out.println(st);
		range(st+1,end);
	}
	public static boolean isarm(int n){
		int l=(n+"").length();
		return isarm(n,n,0,l);
	}
	public static boolean isarm(int n,int m,int sum,int l){
		if(n==0)return m==sum;
		sum+=Math.pow(n%10,l);
		return isarm(n/10,m,sum,l);
	}
}
