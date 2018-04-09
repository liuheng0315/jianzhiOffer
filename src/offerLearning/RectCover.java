package offerLearning;

/**
 * Created by root on 2018/3/13.
 */
public class RectCover {
    public static void main(String[] args) {
        System.out.println(cover(4));
    }
    public static int cover(int n){
        int fristcover=1;
        int twocover=2;
        int result=0;
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        if (n >= 3) {
            for (int i = 3; i <=n ; i++) {
                result=fristcover+twocover;
                fristcover=twocover;
                twocover=result;
            }
        }
        return result;
    }
}
