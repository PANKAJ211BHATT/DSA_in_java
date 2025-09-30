package DSA.Arrays;

public class ARRAY2d {
    public static void main(String[] args) {
        int [][]arr={{1,2,3},{4,5,6}};
        int [][]arr2={{1,2},{4,5},{7,8}};
        int [][] c=new int [2][2];
        for(int i=0 ;i < 2 ; i++ ){
            for(int j = 0 ; j < 2 ; j++){
                c[i][j]=0;
                for(int k=0 ; k<3;k++){
                    c[i][j]+=arr[i][k]*arr2[k][j];
                }
            }
        }

        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.println(c[i][j]);
            }
            System.out.println();
        }
    }
}
