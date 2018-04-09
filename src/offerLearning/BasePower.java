package offerLearning;

/**
 * Created by root on 2018/3/14.
 */
public class BasePower {
    public static void main(String[] args) {
        System.out.println(basepow(3,-5));
        //System.out.println(6&0x1);
    }
    public static double basepow(double base, int exponent) {
        int x=Math.abs(exponent);
        double result=power(base,x);
        if(exponent>=0){
            return result;
        }else{
            return 1/result;
        }
    }
    public static double power(double base ,int exponent){
        if (exponent == 0) {
            return 1;
        }if (exponent == 1) {
            return base;
        }
        double result=power(base,exponent>>1);
        result*=result;
        if ((exponent&0x1)==1) {
            result*=base;
        }
        return result;
    }
}
