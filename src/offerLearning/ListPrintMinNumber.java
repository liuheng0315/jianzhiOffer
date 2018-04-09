package offerLearning;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by root on 2018/4/8.
 */
public class ListPrintMinNumber {
    public static void main(String[] args) {
        int[] arr= new int[]{3,32,321};
        String s=printMinNumber(arr);
        System.out.println(s);
    }
    public static String printMinNumber(int[] numbers){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            list.add(numbers[i]);
        }
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                String s1=o1+""+o2;
                String s2=o2+""+o1;
                return s1.compareTo(s2);
            }
        });
        String s="";
        for (int i = 0; i <list.size() ; i++) {
            s+=list.get(i);
        }
        return s;
    }
}
