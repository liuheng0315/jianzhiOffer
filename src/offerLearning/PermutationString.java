package offerLearning;

import java.util.*;

/**
 * Created by root on 2018/3/27.
 */
public class PermutationString {
    public static void main(String[] args) {
        PermutationString s = new PermutationString();
        TreeSet<String> set = new TreeSet<>();
        char[] chars = "abc".toCharArray();
        s.permutation2(chars, set, 0);
        ArrayList<String> list = new ArrayList<>();
        list.addAll(set);
    }


    public void permutation2(char[] chars, TreeSet<String> set, int begin) {


        for (int i = begin; i < chars.length; i++) {
            char tmp = chars[begin];
            chars[begin] = chars[i];
            chars[i] = tmp;
            set.add(String.valueOf(chars));
            permutation2(chars, set, begin + 1);
            tmp = chars[begin];
            chars[begin] = chars[i];
            chars[i] = tmp;
        }


    }
}
