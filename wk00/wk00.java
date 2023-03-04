public class wk00 {
    public static void drawTriangle(int N) {
        int col, row;
        col=1;
        while(col<=N){
            row=1;
            while(row<=col){
                System.out.print("*");
                row++;
            }
            col++;
            System.out.println();
        }}

    public static int max(int[] m) {
        int i = 0; int maxNum = 0; int n;
        while(i < m.length){
            if (m[i] > maxNum){
            maxNum = m[i];
         }
         i++;
      } return maxNum;
   }

    public static int forMax(int[] m) {
       int maxNum = 0;
       for(int i = 0; i < m.length; i++){
          if(m[i] > maxNum){
             maxNum = m[i];
          }
       }return maxNum;
    }
    public static void windowPosSum(int[] a, int n) {
        for(int i = 0; i < a.length; i++){
        if(a[i] <= 0){
            continue;
         } 
        for (int j = i + 1; j <= i+n ; j++){
            if(j >= a.length){
               break;
               } 
               a[i] += a[j];
            }
 
         } 
         
     }


    public static void main(String[] args) {
        drawTriangle(10);
        int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};  
        System.out.println(max(numbers));     
        System.out.println(forMax(numbers));
        int[] a = {1, 2, -3, 4, 5, 4};
        int n = 3;
        windowPosSum(a, n);
         System.out.println(java.util.Arrays.toString(a));// Should print 4, 8, -3, 13, 9, 4


    }




}