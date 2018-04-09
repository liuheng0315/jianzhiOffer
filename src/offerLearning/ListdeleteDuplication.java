package offerLearning;

/**
 * Created by root on 2018/3/28.
 */
public class ListdeleteDuplication {
    public ListNode deleteDuplication(ListNode PHead) {
        if (PHead==null){
            return null;
        }
        if (PHead!=null&&PHead.next==null){
            return PHead;
        }
        ListNode current = PHead;
        if (PHead.val == PHead.next.val) {
            current=PHead.next.next;
            while (current != null && current.val == PHead.val) {
                current=current.next;
            }
            return deleteDuplication(current);
        }else {
            current=PHead.next;
            PHead.next=deleteDuplication(current);
            return PHead;
        }

    }
    class ListNode{
        int val;
        ListNode next=null;
        public ListNode(int val) {
            this.val = val;
        }
    }
}
