package offerLearning;

import java.util.ArrayList;

/**
 * Created by root on 2018/3/12.
 */
public class RotateArray {
    public static void main(String[] args) {
        int[] arr=new int[]{3,4,5,1,2};
        int[] arr2=rotate(arr);
        for (int n:arr2
             ) {
            System.out.print(n);
        }

    }
    public static int[] rotate(int[] arr){
        if (arr.length==0){
            return null;
        }else {
            int k=arr[0];
            int i=0;
            for (i = 0; i < arr.length; i++) {
                if(arr[i]>=k){
                    k=arr[i];
                    continue;
                }else {
                    break;
                }
            }
            int[] arr2 = new int[arr.length];
            ArrayList arrayList = new ArrayList<Integer>();
            for (int j = i; j <arr.length ; j++) {
                arrayList.add(arr[j]);
            }
            for (int j = 0; j <i ; j++) {
                arrayList.add(arr[j]);
            }
            for (int j = 0; j <arrayList.size() ; j++) {
                arr2[j]=(int)arrayList.get(j);
            }
            return arr2;
        }
    }
}
