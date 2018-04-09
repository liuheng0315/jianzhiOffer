package offerLearning;

/**
 * Created by root on 2018/3/9.
 */
public class BinarySearch {
    public static boolean binarySearch(int[] array,int target){
        int low=0;
        int pow=array.length;
        while(true){
            int middle=(low+pow)/2;
            if(array[middle]==target){
                return true;
            }else if (low>pow){
                return false;
            }else {
                if(array[middle]>target){
                    pow=middle-1;
                }else {
                    low=middle+1;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr={0,2,4,6,8,10,28};
        int target=3;
        System.out.println(binarySearch(arr,target));
    }
}
