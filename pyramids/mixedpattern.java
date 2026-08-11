class mixedpattern{
    public static void main(String[] args) {
        int n=5;
        for(int i=n;i>=1;i--){
            for(int j=i;j>=1;j--){
                if(n!=0){
                    System.out.print(j);
                    if(j>1){
                        System.out.print("*");
                    }
                }
                else{
                    System.out.print("");
                }
            }
            System.out.println();
        }
        
    }
}