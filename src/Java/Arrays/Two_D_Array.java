package Java.Arrays;

import java.util.Scanner;

public class Two_D_Array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the num of row and column for first matrix ");
        int n =sc.nextInt();
        int m = sc.nextInt();

        System.out.println("enter the num of row and column for first matrix ");
        int p=sc.nextInt();
        int q = sc.nextInt();

        int[][] arr1 = new int[n][m];
        int[][] arr2 = new int[n][m];


        System.out.println("enter first matrix element ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }
        System.out.println("enter second matrix element ");
        for (int i = 0; i < p; i++) {
            for (int j = 0; j < q; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }

        multiplication(arr1,arr2,n,m,p,q);


        sc.close();
    }
    public static void add(int [][] arr1,int [][] arr2 ,int n , int m, int p , int q ){
        int[][] arr3 = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr3[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        System.out.println("your addition of 2 matrix is ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr3[i][j] +" ");
            }
            System.out.println();
        }
    }
    public static void multiplication(int [][] arr1,int [][] arr2 ,int n , int m, int p , int q ){
        int [][] matrix3 = new int [n][q];

        for (int i = 0 ; i < n;i++){
            for(int j = 0 ; j < m; j++){
                for (int k =0; k<p ; k++){
                    matrix3[i][j]+=arr1[i][k] * arr2[k][j];
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < q; j++) {
                System.out.print(matrix3[i][j]+" ");
            }
            System.out.println();
        }

    }
}
