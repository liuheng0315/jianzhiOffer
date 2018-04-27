package offerLearning;

public class StrToInt {
    public static void main(String[] args) {

    }
    //将字符串转化为数字
    boolean isValid;
    public int strToInt(String str) {
        //标识是否为合法字符
        isValid=true;
        //判断是否为空，或者为空字符串
        if (str == null || str.length() <= 0) {
            isValid=false;
            return 0;
        }
        //判断第一位的正负号
        boolean negativeFlag=false;
        char[] chars = str.toCharArray();
        if (chars[0] == '-') {
            negativeFlag=true;
        }
        int sum=0;
        for (int i = 0; i < chars.length; i++) {
            if (i==0&&(chars[i] == '-' || chars[i] == '+')) {
                continue;
            }
            if (chars[i] < '0' || chars[i] > '9') {
                isValid=false;
                return 0;
            }
            sum=sum*10+(chars[i]-'0');
            if (negativeFlag) {
                if ((0 - sum) < Integer.MIN_VALUE) {
                    isValid = false;
                    return 0;
                }
            } else {
                if ((sum) > Integer.MAX_VALUE) {
                    isValid = false;
                    return 0;
                }
            }
        }
        return negativeFlag?(0-sum):sum;
    }
}
