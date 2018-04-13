package xiecheng;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by root on 2018/4/3.
 */
public class Main5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <5*n ; i++) {
            list.add(sc.nextInt());
        }
        int k=0;
        int sum=0;
        for (int i = 0; i <5*n ; i++) {
            if (k == 5) {
                sum=0;
                k=0;
            }
            if (k != 5) {
                sum =sum +list.get(i);
                k++;
            }
            if (k == 5) {
                double avg=(double)sum/5;
                if (((int)avg-avg)==0){
                    System.out.println((int)avg);
                }else {
                    System.out.println(-1);
                }
            }
        }
    }
}
