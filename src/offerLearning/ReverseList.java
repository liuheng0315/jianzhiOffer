package offerLearning;

/**
 * Created by root on 2018/3/15.
 */
public class ReverseList {
    public static void main(String[] args) {

    }
    public static ListNode reverse(ListNode head){
        ListNode preNode=null;
        ListNode nextNode=null;
        while(head!=null){
            nextNode=head.next;
            head.next=preNode;
            preNode=head;
            head=nextNode;
        }
        return preNode;
    }
    class ListNode{
        int val;
        ListNode next=null;
        public ListNode(int val) {
            this.val = val;
        }
    }
}
