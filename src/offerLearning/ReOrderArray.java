package offerLearning;

import java.util.ArrayList;

/**
 * Created by root on 2018/3/14.
 */
public class ReOrderArray {
    public static void main(String[] args) {
        int[] arr= new int[]{1,4,5,2,7,9,10,8};
        reOrder2(arr);
    }
    public static void reOrder(int[] array){
        ArrayList arrayList=new ArrayList<Integer>();
        for (int i = 0; i <array.length ; i++) {
            if ((array[i]&0x1) == 1) {
                arrayList.add(array[i]);
            }
        }
        for (int i = 0; i <array.length ; i++) {
            if ((array[i]&0x1) == 0) {
                arrayList.add(array[i]);
            }
        }
        for (int i = 0; i <arrayList.size() ; i++) {
            array[i]=(int)arrayList.get(i);
        }
    }

    public static void reOrder2(int[] array){
        int k=0;
        for (int i = 0; i < array.length ; i++) {
            if ((array[i]&0x1) == 1) {
                int j=i;
                while (j>k){
                    int tmp=0;
                    tmp=array[j];
                    array[j]=array[j-1];
                    array[j-1]=tmp;
                    j--;
                }
                k++;
            }
        }

    }
}
