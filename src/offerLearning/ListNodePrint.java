package offerLearning;

import java.util.ArrayList;

/**
 * Created by root on 2018/3/10.
 */
public class ListNodePrint {

    public static void main(String[] args) {
    }
    public  ArrayList<Integer>  printFristToEnd(ListNode listNode){
        ArrayList<Integer> arrayList=new ArrayList<Integer>();
        ArrayList<Integer> arrayList2=new ArrayList<Integer>();
        if(listNode!=null){
            while (listNode!=null){
                arrayList.add(listNode.value);
                listNode=listNode.next;
            }
        }
        for (int i=arrayList.size();i<0;i--){
            arrayList2.add(arrayList.get(i));
        }
        return arrayList2;
    }

    class ListNode{
        int value;
        ListNode next;
    }
}
