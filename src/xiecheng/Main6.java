package xiecheng;

import java.util.*;

/**
 * Created by root on 2018/4/3.
 */
public class Main6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] arr = new int[t];
        ArrayList<Integer> list = new ArrayList<>();
        int h=0;
        while (t>0){
            arr[h]=sc.nextInt();
            for (int i = 0; i <2*arr[h] ; i++) {
                list.add(sc.nextInt());
            }
            h++;
            t--;
        }
        ArrayList<Integer> list2;
        int j2=0;
        for (int i = 0; i <arr.length ; i++) {
            list2=new ArrayList<Integer>();
            for (int j = 0; j <2*arr[i] ; j++) {
                list2.add(list.get(j2));
                j2++;
            }
            Collections.sort(list2);
            if (list2.get(list2.size()/2)>list2.get(list2.size()/2-1)){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }
}
