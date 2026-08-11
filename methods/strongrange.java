class strongrange 
{
	public static void main(String[] args) 
	{
		range(1,200);
	}
	public static void range(int st,int end){
		if(st>end)return;
		if(isstrong(st))System.out.println(st);
		range(st+1,end);
	}
	public static boolean isstrong(int n){
		return isstrong(n,n,0);
	}
	public static boolean isstrong(int n,int m,int sum){
		if(n==0)return m==sum;
		int r=n%10;
		sum=sum+fact(r);
		return isstrong(n/10,m,sum);
	}
	public static int fact(int r){
		if(r==0) return 1;
		return r*fact(r-1);
	}
}
