class lcm{
public static void main(String[] args){
int n=24;
int m=36;
while(m>0){
int temp=m;
m=n%m;
n=temp;
}
int hcf=n;
System.out.println(hcf);
int lcm=(n*m)/hcf;
System.out.println(lcm);
}
}
