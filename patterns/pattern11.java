class pattern11{
 public static void main(String[] args){
 int n=3;
 int m=5;
 for(int i=1;i<=m;i++){
  for(int j=1;j<=n;j++){
   if(i==j||i+j==n*2){
    System.out.print("* ");
   }
   else{
    System.out.print("  ");
   }
  }
  System.out.println();
 }
}
}