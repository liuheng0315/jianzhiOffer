package offerLearning;

import java.util.ArrayList;
import java.util.HashMap;

public class FindNumbersWithSum {
    //有序数组中和为S的两个数字
    public ArrayList<Integer> findNumber(int[] array, int sum) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        int min=0X7FFFFFFF;
        for (int i = 0; i < array.length; i++) {
            int other = sum - array[i];
            if (hashMap.containsKey(other)) {
                if (other * array[i]<min) {
                    min = other * array[i];
                    list.clear();
                    list.add(other);
                    list.add(array[i]);
                }
            }
            hashMap.put(array[i], i);
        }
        return list;
    }
}
