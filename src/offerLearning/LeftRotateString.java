package offerLearning;

public class LeftRotateString {
    //左旋转字符串
    //input:S=”abcXYZdef”->cbafedZYX->XYZdefabc
    //output:“XYZdefabc”
    public static void main(String[] args) {
        LeftRotateString lrs = new LeftRotateString();
        String res = lrs.leftRotateString("abcXYZdef", 3);
        System.out.println(res);
    }

    char[] chars;

    public String leftRotateString(String str, int n) {
        chars = str.toCharArray();
        if (str == null || str.length() == 0 || n == 0) {
            return str;
        }
        int left = 0;
        int right = n - 1;
        resver(chars, left, right);
        resver(chars, right + 1, chars.length - 1);
        resver(chars, 0, chars.length - 1);
        StringBuffer sb = new StringBuffer();
        for (char ch : chars
                ) {
            sb.append(ch);
        }
        return sb.toString();
    }

    private void resver(char[] ch, int left, int right) {
        while (left < right) {
            char tmp = ch[left];
            ch[left] = ch[right];
            ch[right] = tmp;
            left++;
            right--;
        }
    }
}
