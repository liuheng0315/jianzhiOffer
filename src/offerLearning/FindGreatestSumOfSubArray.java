package offerLearning;

import java.util.ArrayList;

/**
 * Created by root on 2018/3/22.
 */
public class FindGreatestSumOfSubArray {
    public static void main(String[] args) {
        System.out.println();
    }
    int max=0x80000000;
    int sum=0;
    private int find(int[] array){
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i <array.length ; i++) {
            if (sum<=0){
                sum=array[i];
            }else {
                sum+=array[i];
            }
            if (sum>max){
                max=sum;
            }
        }
        return max;
    }
}
