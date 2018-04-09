package offerLearning;

/**
 * Created by root on 2018/3/22.
 */
public class VerifySquenceOfBST {
    public static void main(String[] args) {

    }
    public static boolean verify(int[] array,int begin,int end){
        if (begin>=end){
            return true;
        }
        int i;
        for (i=begin; i <end ; i++) {
            if(array[i]>array[end]){
                break;
            }
        }
        for (int j = i; j <end ; j++) {
            if(array[end]>array[j]){
                return false;
            }
        }
        verify(array,begin,i-1);
        verify(array,i+1,end);
        return false;
    }
}
