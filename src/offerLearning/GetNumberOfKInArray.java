package offerLearning;

//统计一个数字在排序数组中出现的次数
public class GetNumberOfKInArray {
    public static void main(String[] args) {
        GetNumberOfKInArray getNumberOfKInArray = new GetNumberOfKInArray();
        int[] arr=new int[]{3,3,3,3,4,5};
        System.out.println(getNumberOfKInArray.getNumberOfk(arr,3));
    }

    public int getNumberOfk(int[] array, int k) {
        if (array.length <= 0) {
            return 0;
        }
        int low=0;
        int high=array.length-1;
        //i记录出现该数字的位子
        int i=-1;
        //count记录该数字出现的次数
        int count=0;
        while (true) {
            int middle=(low+high)/2;
            if (array[middle] == k) {
                i=middle;
                break;
            }else if(low>high){
                return 0;
            }else {
                if (array[middle] > k) {
                    low=middle+1;
                }else {
                    high=middle-1;
                }
            }
        }
        if (i !=-1) {
            //判断i的前后有几个一样的K
            int j=i-1;
            while (j >= 0 && array[j] == k) {
                count++;
                j--;
            }
            while (i <= array.length - 1 && array[i] == k) {
                count++;
                i++;
            }
            return count;
        }else {
            return count;
        }
    }
}
