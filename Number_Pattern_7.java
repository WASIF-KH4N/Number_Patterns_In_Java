 class Number_Pattern_7 {
     public static void main(String[] args) {
         for(int i=1;i<=7;i++){
             int num=i;
             for(int j=1;j<=i;j++){
                 System.out.print(num+" ");
                 num=num+7-j;
             }
             System.out.println();
         }
     }
}
