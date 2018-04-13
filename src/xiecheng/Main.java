package xiecheng;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by root on 2018/3/29.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        ArrayList<Integer> list =new ArrayList<Integer>();
        for (int i = 0; i <n ; i++) {
            arr1[i]=sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (arr1[i]!=0){
                list.add(arr1[i]);
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr1[i]==0){
                list.add(arr1[i]);
            }
        }
        for (Integer j : list
                ) {
            System.out.println(j);
        }
    }
}
