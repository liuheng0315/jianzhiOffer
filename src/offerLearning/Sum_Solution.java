package offerLearning;

public class Sum_Solution {
    //求1+2+3+......+n
    public int sum(int n) {
        if (n == 1) {
            return 1;
        }
        return sum(n-1)+n;
    }
}
