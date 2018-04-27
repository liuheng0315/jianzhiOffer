package offerLearning;

public class ReverseSentence {
    //反转句子
    //input:“student. a am I”->I ma a .tneduts->I ma a student.
    //output:“I am a student.”
    public static void main(String[] args) {
        ReverseSentence rs = new ReverseSentence();
        String s = rs.reverseSentence("student. a am I");
        System.out.println(s);
    }
    char[] ch;
    public String reverseSentence(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        ch = str.toCharArray();
        resver(ch,0,ch.length-1);
        int i = 0;
        for (int j = 0; j < ch.length; j++) {
            if (ch[j] == ' ') {
                resver(ch,i,j-1);
                i=j+1;
            }else if(j==ch.length-1){
                resver(ch,i,j);
            }
        }
        StringBuffer sb = new StringBuffer();
        for (char c :
                ch) {
            sb.append(c);
        }
        return sb.toString();
    }

    private void resver(char[] ch, int left, int right) {
        while (left < right) {
            char tmp;
            tmp = ch[left];
            ch[left] = ch[right];
            ch[right] = tmp;
            left++;
            right--;
        }
    }
}
