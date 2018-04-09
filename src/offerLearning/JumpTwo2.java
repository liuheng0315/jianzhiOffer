package offerLearning;

/**
 * Created by root on 2018/3/13.
 */
public class JumpTwo2 {
    public static void main(String[] args) {
        System.out.println(jump(4));
    }
    public static int jump(int n){
        int totalnum=0;
        if (n==1){
            return 1;
        }
        if (n==2){
            return 2;
        }if (n>=3) {
            for (int i = n - 1; i > 0; i--) {
                totalnum = jump(i) + totalnum;
            }
        }
        return totalnum+1;
    }
}
