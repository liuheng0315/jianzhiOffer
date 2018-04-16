package offerLearning;

import java.util.ArrayList;

public class FindContinuousSequence {
    //和为S的正数序列
    public ArrayList<ArrayList<Integer>> findSequence(int sum){
        if (sum < 3) {
            return null;
        }
        ArrayList<ArrayList<Integer>> arrayLists = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> list ;
        int i=1;
        int j=2;
        //当i大于（1+sum）/2时停止，因为题目要求最少有两个数
        while (i >= (1 + sum) / 2) {
            int totalSum = addToSum(i, j);
            if (totalSum<sum) {
                j++;
            } else if (totalSum > sum) {
                i++;
            }else {
                list=new ArrayList<Integer>();
                for (int k = i; k <=j ; k++) {
                    list.add(k);
                }
                arrayLists.add(list);
                i++;
                j++;
            }
        }
        return arrayLists;
    }

    public int addToSum(int i, int j) {
        int sum=0;
        for (int k = i; k <=j ; k++) {
            sum+=k;
        }
        return sum;
    }
}
