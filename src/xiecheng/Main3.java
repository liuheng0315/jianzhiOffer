package xiecheng;

import java.util.Scanner;

/**
 * Created by root on 2018/3/29.
 */
public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N1=sc.nextLine();
        String[] split1 = N1.split("--");
        int N =Integer.parseInt(split1[0]);
        String[] strings = new String[N];
        for (int i = 0; i <strings.length ; i++) {
            strings[i]=sc.nextLine();
        }
        String str=sc.nextLine();
        String[] split = str.split(" ");
        int x1=Integer.valueOf(split[0]);
        int x2=Integer.valueOf(split[1]);
        int n=Integer.valueOf(split[2]);
        int count =1;
        int count2=0;
        for (int i = 0; i <strings.length ; i++) {
            String[] split2 = str.split(" ");
            int y1=Integer.valueOf(split2[0]);
            int y2=Integer.valueOf(split2[1]);
            int k=Integer.valueOf(split2[2]);
            if (y1 >= x1) {
                if (y2 >= x2) {
                    double j = k*n;
                    int jj=k*n;
                    System.out.println(count+","+k+","+j+" "+split2[3]+","+"数量为"+k+","+"总价为"+jj);
                    count2++;

                }
            }
        }
        if (count2==0){
            System.out.println(-1);
        }
    }
}
