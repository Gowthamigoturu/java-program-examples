import java.util.Scanner;
class b2d
{
	public static void main(String[] args) 
	{
		System.out.println("Enter a num:");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
		System.out.println(b2d(n));
	}
	public static int b2d(int m){
		int a=0;
		int power=0;
		while(m>0){
			int d=m%10;
			a+=d*Math.pow(2,power);
			m/=10;
			power++;
		}
		return a;
	}
}
