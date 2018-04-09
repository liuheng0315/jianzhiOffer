package offerLearning;

/**
 * Created by root on 2018/3/13.
 */
public class NumberOf1 {
    public static void main(String[] args) {
        System.out.println(numberOf(5));
    }
    public static int numberOf(int n){
        int count=0;
        if (n == 0) {
            return 0;
        }
        while (n!=0){
            n=n&(n-1);
            count++;
        }
        return count;
    }
}
