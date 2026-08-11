import java.util.Scanner;
class palindrome  
{
	public static void main(String[] args) 
	{
		System.out.println("Enter a num:");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
		if(is_palindrome(n))
		System.out.println("palindrome");
		else System.out.println("not palindrome");
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
