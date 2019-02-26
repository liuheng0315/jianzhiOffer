package offerLearning;

/**
 * 给一个链表，若其中包含环，请找出该链表的环的入口结点，否则，输出null。
 */
public class MeetingNodeIsCricle {
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
    //使用一快一慢两个指针判断是否有环
    public ListNode meetingNode(ListNode pHead){
        if (pHead == null) {
            return null;
        }
        ListNode pSlow = pHead.next;
        if (pSlow == null) {
            return null;
        }
        ListNode pFast = pSlow.next;
        while (pFast != null && pSlow != null) {
            if (pFast == pSlow) {
                return pFast;
            }
            pSlow=pSlow.next;
            pFast=pFast.next;
            if (pFast != null) {
                pFast=pFast.next;
            }
        }
        return null;
    }

    public ListNode entryNodeOfLoop(ListNode pHead){
        ListNode meetingNode = meetingNode(pHead);
        if (meetingNode == null) {
            return null;
        }
        int nodesInLoop=1;
        ListNode pNode1=meetingNode;
        while (pNode1.next != meetingNode) {
            pNode1=pNode1.next;
            nodesInLoop++;
        }
        pNode1=pHead;
        //先移动pNode1
        for (int i = 0; i < nodesInLoop; i++) {
            pNode1=pNode1.next;
        }
        ListNode pNode2 = pHead;
        while (pNode1 != pNode2) {
            pNode1=pNode1.next;
            pNode2=pNode2.next;
        }
        return pNode1;
    }
}
