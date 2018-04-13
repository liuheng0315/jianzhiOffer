package xiecheng;

import java.util.Scanner;

/**
 * Created by root on 2018/4/3.
 */
public class Main7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//weiz
        int m = sc.nextInt();//k
        System.out.println(find(n,m));
    }
    public static int find(int n,int m){
        if (n<m){
            return 0;
        }
        if(m==1){
            return 1;
        }
        if (n==m){
            return 1;
        }
        return find(n-1,m-1)+find(n-m,m);
    }
}
