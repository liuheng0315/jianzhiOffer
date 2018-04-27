package offerLearning;

public class LastRemaining_Solution {
    //圆圈中最后剩下的数字
    public static void main(String[] args) {
        LastRemaining_Solution ls = new LastRemaining_Solution();
        int ans = ls.lastRemaining(10, 2);
        System.out.println(ans);
    }
    public int lastRemaining(int n, int m) {
        if (n < 1 || m < 1) {
            return -1;
        }
        if (n == 1) {
            return 0;
        }
        return (lastRemaining(n-1,m)+m)%n;
    }
}
