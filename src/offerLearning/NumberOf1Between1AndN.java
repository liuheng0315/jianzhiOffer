package offerLearning;

/**
 * Created by root on 2018/4/6.
 */
public class NumberOf1Between1AndN {
    public static void main(String[] args) {

    }
    public int numberOf1AndN(int n){
        int count=0;
        for (int i=1;i<=n;i*=10){
            int m=n%i,k=n/i;
            count+=(k+8)/10*i+(k%10==1?m+1:0);
        }
        return count;
    }
}
