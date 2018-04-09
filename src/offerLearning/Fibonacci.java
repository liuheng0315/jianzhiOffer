package offerLearning;

/**
 * Created by root on 2018/3/13.
 */
public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacci(4));
    }
    //普通递归
//    public static int fibonacci(int n){
//        if (n == 1) {
//            return 1;
//        }if (n == 2) {
//            return 2;
//        }
//        return fibonacci(n-1)+fibonacci(n-2);
    //使用for循环从前往后
    public static  int fibonacci(int n){
        int fristone=0;
        int fristtwo=1;
        int result=0;
        if (n == 0) {
            return 0;
        }if (n == 1) {
            return 1;
        }
        if (n >=2) {
            for (int i = 2; i <= n; i++) {
                result=fristone+fristtwo;
                fristone=fristtwo;
                fristtwo=result;
            }
        }
        return result;
    }
}
