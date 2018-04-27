package offerLearning;

public class Add {
    //不用加减乘除做加法，思路使用位与运算
    public int add(int num1,int num2) {
        int n1=num1^num2;
        int n2=num1&num2<<1;
        return n2==0?n1:(add(n1,n2));
    }
}
