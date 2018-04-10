package offerLearning;

import java.util.ArrayList;

/**
 * Created by root on 2018/4/9.
 */
public class GetUglyNumber {
    //判断一个数是不是丑数
    public static void main(String[] args) {

    }

    public static int getUgly(int index) {
        ArrayList<Integer> list = new ArrayList<>();
        if (index <= 0) {
            return -1;
        } else if (index == 1) {
            return 1;
        }
        list.add(1);
        int t1 = 0, t2 = 0, t3 = 0;
        while (list.size() < index) {
            int n1 = list.get(t1) * 2;
            int n2 = list.get(t2) * 3;
            int n3 = list.get(t3) * 5;
            int min = Math.min(n1, Math.min(n2, n3));
            list.add(min);
            if (min == n1) {
                t1++;
            }
            if (min == n2) {
                t2++;
            }
            if (min == n3) {
                t3++;
            }
        }
        return list.get(index-1);
    }
}
