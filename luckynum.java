// Online Java Compiler
// Use this editor to write, compile and run your Java code online

public class Main{
    public static void main(String[] args){
        int[][] mat={{0,1,2},{3,4,5},{6,7,8},{9,10,11}};
        int n=mat.length-1;
        int i,j;
        for(i=0;i<n;i++){
           System.out.print(mat[0][i]+" ");
        }
        for(i=n-1;i>=0;i--){
            System.out.print(mat[1][i]+" ");
        }
        for(i=0;i<n;i++){
         System.out.print(mat[n-1][i]+" ");
        }
        for(i=n-1;i>=0;i--){
           System.out.print(mat[n][i]+" ");  
        }
         System.out.print("\n");
    }
}
