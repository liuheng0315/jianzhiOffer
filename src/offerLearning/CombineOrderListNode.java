package offerLearning;

/**
 * Created by root on 2018/3/15.
 */
public class CombineOrderListNode {
    public static void main(String[] args) {

    }
    public static ListNode merge(ListNode list1,ListNode list2){
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        ListNode mergeList=null;
        if (list1.val <= list2.val) {
            mergeList=list1;
            mergeList.next=merge(list1.next,list2);
        }else {
            mergeList=list2;
            mergeList.next=merge(list1,list2.next);
        }
        return mergeList;
    }
    class ListNode{
        int val;
        ListNode next=null;
        public ListNode(int val) {
            this.val = val;
        }
    }
}
