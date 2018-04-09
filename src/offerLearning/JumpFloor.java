package offerLearning;

/**
 * Created by root on 2018/3/13.
 */
public class JumpFloor {
    public static void main(String[] args) {
        System.out.println(jump(10));
    }
    public static int jump(int n){
        if (n == 0) {
            return 0;
        }if (n == 1) {
            return 1;
        }if (n == 2) {
            return 2;
        }
        int fristjumpone=1;
        int fristjumptwo=2;
        int result=0;
        if (n >=3) {
            for (int i = 3; i <= n; i++) {
                result=fristjumpone+fristjumptwo;
                fristjumpone=fristjumptwo;
                fristjumptwo=result;
            }
        }
        return result;
    }
}
