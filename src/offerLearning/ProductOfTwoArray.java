package offerLearning;

/**
 * 构建两个数组的乘积
 * 给定一个数组A[0,1,...,n-1],请构建一个数组B[0,1,...,n-1],
 * 其中B中的元素B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]。不能使用除法。
 */
public class ProductOfTwoArray {
    public static void main(String[] args) {
        int[] arr=new int[]{1,2,3,4,5,6};
        int[] ints = solution(arr);
        for (int i:ints
             ) {
            System.out.println(i);
        }
    }
    public static int[] solution(int[] arr){
        if(arr.length>0) {
            int len = arr.length;
            int[] ints = new int[len];
            ints[0] = 1;
            //计算下三角连乘
            for (int i = 1; i < len; i++) {
                ints[i]=ints[i-1]*arr[i - 1];
            }
            int tmp=1;
            //计算上三角连乘
            for (int i = len-2; i >=0 ; i--) {
                tmp =tmp*arr[i+1];
                ints[i]=ints[i]*tmp;
            }
            return ints;
        }
        return null;
    }
}
