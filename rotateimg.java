public class Main{
    public static void main(String[] args){
        int[][] mat={{1,2,3},{4,5,6},{7,8,9}};
        int n=mat.length;
        int m=mat[0].length;
        int i,j;
        for(i=0;i<m;i++){
            for(j=i;j<n;j++){
                int temp=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;
            }
        }
       
        for(i=0;i<n;i++){
        int l=0;
        int r=n-1;
       
       
        while(l<r){
               int temp=mat[i][l];
               mat[i][l]=mat[i][r];
               mat[i][r]=temp;
               l++;
               r--;
               
            }
        }
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                System.out.print(mat[i][j]+" ");
            }
                System.out.print("\n");
        }
    }
}
