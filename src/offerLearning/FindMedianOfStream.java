package offerLearning;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * 如何得到一个数据流中的中位数？如果从数据流中读出奇数个数值，那么中位数就是所有数值排序之后位于中间的数值。
 * 如果从数据流中读出偶数个数值，那么中位数就是所有数值排序之后中间两个数的平均值。
 * 我们使用Insert()方法读取数据流，使用GetMedian()方法获取当前读取数据的中位数。
 */
public class FindMedianOfStream {
    private int count = 0;
    private PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    private PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(15,
            new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return o2-o1;
                }
            });

    public void Insert(Integer num) {
        //当数据总数为偶数时，新加入的元素，应该进入小根堆
        //注意不是直接进入小根堆，而是经过大根堆筛选后取大根堆中最大的元素进入小根堆
        //新加入的元素先进入到大根堆，由大根堆筛选出最大的元素
        if (count % 2 == 0) {
            maxHeap.offer(num);
            Integer filteredMaxNum = maxHeap.poll();
            //筛选后【大根堆的最大元素】进入小根堆
            minHeap.offer(filteredMaxNum);
        }else {
            //当总数为奇数时，新加入的元素应该进入大根堆
            //注意不是直接进入大根堆，二是经过小根堆筛选后进入大根堆
            //新加的元素先入小根堆，由小根堆筛选出堆中的最小元素
            minHeap.offer(num);
            int filteredMinNum = minHeap.poll();
            //筛选后的小根堆元素进入到大根堆
            maxHeap.offer(filteredMinNum);
        }
        count++;
    }
    public Double GetMedian(){
        if (count % 2 == 0) {
            return new Double((minHeap.peek() + maxHeap.peek())) / 2;
        }else {
            return new Double((minHeap.peek()));
        }
    }
}
