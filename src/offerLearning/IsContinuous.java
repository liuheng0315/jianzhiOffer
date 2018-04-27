package offerLearning;

import java.util.Arrays;

public class IsContinuous {
    //扑克牌是否为顺子
    public boolean isContinuous(int [] numbers) {
        if (numbers.length == 0) {
            return false;
        }
        Arrays.sort(numbers);
        //0出现的次数
        int countzero=0;
        //间隔出现的次数
        int countInterval=0;
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] == 0) {
                countzero++;
                continue;
            }
            if (numbers[i] == numbers[i + 1]) {
                return false;
            }
            countInterval+=numbers[i+1]-numbers[i]-1;
        }
        if (countzero >= countInterval) {
            return true;
        }
        return false;
    }
}
