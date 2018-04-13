package xiecheng;

import java.util.Scanner;

/**
 * Created by root on 2018/3/29.
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String[] split = s1.split(" ");
        int count=split.length;
        int[][] arr = new int[count][count];
        for (int i = 0; i <split.length ; i++) {
            arr[0][i]=Integer.valueOf(split[i]);
        }
        for (int i = 1; i <split.length ; i++) {
            for (int j = 0; j <split.length ; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        rotate(arr,count);
    }
    public static void rotate(int[][] mat,int n) {
        int[][] arr1 = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr1[j][n - 1 - i] = mat[i][j];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == n-1) {
                    System.out.print(arr1[i][j] + " ");
                }else {
                    if (j==n-1){
                        System.out.println(arr1[i][j] + " ");
                    }else {
                        System.out.print(arr1[i][j] + " ");
                    }
                }
            }
        }
    }
}