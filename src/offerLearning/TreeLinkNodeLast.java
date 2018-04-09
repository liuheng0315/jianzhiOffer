package offerLearning;

/**
 * Created by root on 2018/3/28.
 */
public class TreeLinkNodeLast {
    public TreeLinkNode getNext(TreeLinkNode pNode){
        if (pNode == null) {
            return null;
        }
        TreeLinkNode pNext=null;
        TreeLinkNode pRight=null;
        if (pNode.right!=null){
            pRight=pNode.right;
            while(pRight.left!=null){
                pRight=pRight.left;
            }
            pNext=pRight;
        }else if(pNode.next!=null){
            TreeLinkNode current=pNode;
            TreeLinkNode parent=pNode.next;
            while(parent!=null&&current==parent.right){
                current=parent;
                parent=parent.next;
            }
            pNext=parent;
        }
        return pNext;
    }
    class TreeLinkNode {
        int val;
        TreeLinkNode left = null;
        TreeLinkNode right = null;
        TreeLinkNode next = null;

        TreeLinkNode(int val) {
            this.val = val;
        }
    }
}
