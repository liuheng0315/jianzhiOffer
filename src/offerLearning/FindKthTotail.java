package offerLearning;

/**
 * Created by root on 2018/3/15.
 */
public class FindKthTotail {
    public static void main(String[] args) {

    }
    public static ListNode find(ListNode head,int k){
        if (head==null||k<=0){
            return null;
        }
        ListNode fristRun=head;
        ListNode twoRun=head;
        for (int i = 0; i <k-1 ; i++) {
            if (fristRun.next!=null) {
                fristRun = fristRun.next;
            }else {
                return null;
            }
        }
        while (fristRun.next!=null){
            fristRun=fristRun.next;
            twoRun=twoRun.next;
        }
        return twoRun;
    }
    class ListNode{
        int val;
        ListNode next=null;

        public ListNode(int val) {
            this.val = val;
        }
    }
}
