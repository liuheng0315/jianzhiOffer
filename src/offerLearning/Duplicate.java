package offerLearning;

import java.util.HashSet;

public class Duplicate {
    public static void main(String[] args) {
        Duplicate duplicate = new Duplicate();
        boolean b = duplicate.duplicate(new int[]{}, 0, new int[]{});
    }
    //字符串中的字符是否重复
    public boolean duplicate(int numbers[],int length,int [] duplication) {
        if (numbers.length == 0||numbers==null) {
            return false;
        }
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < length; i++) {
            if (!set.add(numbers[i])) {
                duplication[0] = numbers[i];
                return true;
            }
        }
        return false;
    }
}
