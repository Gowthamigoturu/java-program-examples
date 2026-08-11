class primepalindrome 
{
	public static void main(String[] args) 
	{
		int n=200;
		for(int i=1;i<=n;i++){
			if(is_prime(i)&&is_palindrome(i))
			System.out.println(i);	
		}
	}
	public static boolean is_prime(int m){
		boolean b=true;
		for(int i=2;i<=m/2;i++){
			if(m%i==0){
				b=false;
				break;
			}
		}
		return m>=2&&b;
	}
	public static boolean is_palindrome(int m) {
        int count=0;
		int i=m;
        int rev=0;
        while(m>0){
            rev=(rev*10)+(m%10);
			m/=10;
        }
        return (rev==i);
    }
}
