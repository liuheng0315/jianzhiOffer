package offerLearning;

public class FindFirstCommonNode {
    //两个链表的第一个公共节点
    public static void main(String[] args) {

    }

    public ListNode findFristNode(ListNode pHead1, ListNode pHead2) {
        int n1=0;
        int n2=0;
        ListNode node1=pHead1;
        ListNode node2=pHead2;
        while (node1 !=null) {
            node1= node1.next;
            n1++;
        }
        while (node2 !=null) {
            node2= node2.next;
            n2++;
        }
        if (n1 > n2) {
           int j=n1-n2;
            while (j>0){
                pHead1=pHead1.next;
                j--;
            }
        }else {
            int j=n2-n1;
            while (j>0){
                pHead2=pHead2.next;
                j--;
            }
        }
        while (pHead1 != pHead2) {
            pHead1=pHead1.next;
            pHead2=pHead2.next;
        }
        return pHead1;
    }
    class ListNode{
        int val;
        ListNode next=null;

        public ListNode(int val) {
            this.val = val;
        }
    }
}
