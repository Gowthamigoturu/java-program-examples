import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        System.out.println("Enter a num:");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int j=2;
        while(j<=n){
            boolean a=true;
            for(int i=2;i<=j/2;i++){
                if(j%i==0)
                {
                    a=false;
                    break;
                }
            }
            if(a)System.out.print(j+" ");
            j++;
        }
    }
}