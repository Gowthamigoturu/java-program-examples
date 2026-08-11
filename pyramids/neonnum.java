class neonnum{
public static void main(String[] args){
int n=9;
int s=n*n;
int sum=0;
while(s>0){
int r=s%10;
sum=sum+r;
s/=10;
}
if(sum==n){
System.out.println("neon num");
}
else{
System.out.println("not neon num");
}
}
}
