package offerLearning;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Created by root on 2018/3/29.
 */
public class GetLeastNumbers_Solution {
    public ArrayList<Integer> getLeastNumbers(int[] input,int k){
        ArrayList<Integer> list = new ArrayList<>();
        if (input.length==0||k<=0||k>input.length){
            return list;
        }
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>(k, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        for (int i = 0; i <input.length ; i++) {
            if (priorityQueue.size()!=k){
                priorityQueue.add(input[i]);
            } else if (priorityQueue.peek() > input[i]) {
                priorityQueue.poll();
                priorityQueue.add(input[i]);
            }
        }
        for (Integer n:priorityQueue
             ) {
            list.add(n);
        }
        return list;
    }
}
