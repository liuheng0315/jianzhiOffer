package offerLearning;

/**
 * Created by root on 2018/3/29.
 */
public class MoreThanHalfNum_Solution {
    public static void main(String[] args) {
        moreThanHalfNum(new int[]{1,2,3,2,2,2,5,4,2});
    }
    public static int moreThanHalfNum(int[] array){
        if (array.length==0){
            return 0;
        }
        int i=1;
        int result=array[0];
        for (int j = 1; j < array.length; j++) {
            if (i == 0) {
                result=array[j];
                i=1;
            } else if (result == array[j]) {
                i++;
            }else {
                i--;
            }
        }
        int count =0;
        for (int j = 0; j <array.length ; j++) {
            if (result == array[j]) {
                count++;
            }
        }
        if (count > array.length / 2) {
            return result;
        } else {
            return 0;
        }

    }
}
