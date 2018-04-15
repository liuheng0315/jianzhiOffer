package offerLearning;

public class FindNumsAppearOnce {
    //查找数组中只出现一次的数字
    public static void main(String[] args) {

    }

    public void findNumsAppearOnce(int[] array, int[] num1, int[] num2) {
        //将所有数字异或，得到一个二进制，判断二进制第一个1出现的位子，然后将数组分成两组
        int length = array.length;
        if (length == 2) {
            num1[0] = array[0];
            num2[0] = array[1];
        }
        int result=0;
        for (int i = 0; i < array.length; i++) {
            result ^= array[i];
        }
        int index = findOneInResult(result);
        for (int i = 0; i < array.length; i++) {
            if (isBit1(array[i], index)) {
                num1[0] ^= array[i];
            } else {
                num2[0] ^= array[i];
            }
        }
    }
    //找到二进制result中第一个1出现的位置
    public int findOneInResult(int result){
        int index=0;
        while (((result & 1) == 0) && index < 32) {
            result=result>>1;
            index++;
        }
        return index;
    }
    //判断第index位是不是1
    public boolean isBit1(int target,int index) {
        if (((target >> index) & 1) == 1) {
            return true;
        } else {
            return false;
        }
    }
}
