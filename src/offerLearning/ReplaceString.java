package offerLearning;

/**
 * Created by root on 2018/3/10.
 */
public class ReplaceString {
    public static void main(String[] args) {
        System.out.println(replace("hello world hehe"));
    }
    public static String replace(String str){
        int orginlength=str.length();
        int count=0;
        for (int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                count++;
            }
        }
        char[] chars = new char[orginlength + count*2];
        int newlength=chars.length;
        int indexoforginal=orginlength-1;
        int indexofnew =newlength-1;
        while (indexoforginal>=0){
            if (str.charAt(indexoforginal)!=' '){
                chars[indexofnew]=str.charAt(indexoforginal);
                indexoforginal--;
                indexofnew--;
            }else {
                chars[indexofnew--]='0';
                chars[indexofnew--]='2';
                chars[indexofnew--]='%';
                indexoforginal--;
            }
        }
        StringBuffer strBuffer=new StringBuffer();
        for (char ch:chars
             ) {
            strBuffer.append(ch);
        }
        return strBuffer.toString();
    }
}
