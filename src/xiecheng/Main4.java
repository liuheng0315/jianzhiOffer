package xiecheng;

import java.util.*;

/**
 * Created by root on 2018/3/30.
 */
public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        HashSet<Integer> set = new HashSet<>();
        int[] arr=new int[m];
        for (int i = 0; i < m; i++) {
            arr[i]=sc.nextInt();
            set.add(arr[i]);
        }
        int avg=0;
        int k=0;
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int i = 1; i <=n ; i++) {
            if (!set.contains(i)){
                for (int j = 0; j <arr.length ; j++) {
                    avg+=Math.abs(i-arr[j]);
                }
                map.put(i,avg);
                avg=0;
            }
        }
        int minavg=1000000000;
        for (Integer value:map.values()
             ) {
            if (value < minavg) {
                minavg=value;
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry:map.entrySet()
                ) {
            if (entry.getValue()==minavg) {
                list.add(entry.getKey());
            }
        }
        Collections.sort(list);
        System.out.println(list.get(0));
    }
}
