package offerLearning;

/**
 * Created by root on 2018/4/2.
 */
public class CountDigitOne {
    public static void main(String[] args) {
        System.out.println(count(11));
    }
    public static  int count(int n){
        int count=0;
        for (int k = 1; k <=n ; k*=10) {
            int m=n%k,r=n/k;
            count+=(r+8)/10*k+(r%10==1?m+1:0);
        }
        return count;
    }
}
