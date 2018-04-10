import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by root on 2018/4/10.
 */
public class FirstNotRepeatingChar {
    //第一个不重复的字符
    public static void main(String[] args) {

    }
    public static int fristNotRepeating(String str){
        char[] chars = str.toCharArray();
        LinkedHashMap<Character, Integer> linkedHashMap = new LinkedHashMap<>();
        for (int i = 0; i < chars.length; i++) {
            if (linkedHashMap.containsKey(chars[i])) {
                int k = linkedHashMap.get(chars[i]);
                k++;
                linkedHashMap.put(chars[i], k);
            } else {
                linkedHashMap.put(chars[i],1);
            }
        }
        char j=0;
        for (Map.Entry<Character, Integer> entry :
                linkedHashMap.entrySet()) {
            if (entry.getValue() == 1) {
                j=entry.getKey();
                break;
            }
        }
        int h=0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i]==j){
                h=i;
            }
        }
        return h;
    }
}
