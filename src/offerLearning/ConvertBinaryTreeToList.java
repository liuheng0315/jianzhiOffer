package offerLearning;

/**
 * 输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。
 * 要求不能创建任何新的结点，只能调整树中结点指针的指向
 */
public class ConvertBinaryTreeToList {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;
        public TreeNode(int val) {
            this.val = val;
        }
    }

    //使用中序遍历
    public TreeNode convert(TreeNode pRootOfTree) {
        TreeNode pLastNodeInList = null;
        pLastNodeInList = convertNode(pRootOfTree , pLastNodeInList);
        //pLastNodeInList指向双向链表的尾节点
        //需要返回头结点
        TreeNode pHeadOfList = pLastNodeInList;
        while (pHeadOfList != null && pHeadOfList.left != null) {
            pHeadOfList=pHeadOfList.left;
        }
        return pHeadOfList;
    }

    private TreeNode convertNode(TreeNode pNode, TreeNode pLastNodeInList) {
        if (pNode == null) {
            return pLastNodeInList;
        }
        TreeNode pCurrent = pNode;
        //转化左子树
        if (pCurrent.left != null) {
            pLastNodeInList = convertNode(pCurrent.left,pLastNodeInList);
        }
        //与根节点衔接
        pCurrent.left=pLastNodeInList;
        if (pLastNodeInList != null) {
            pLastNodeInList.right=pCurrent;
        }
        pLastNodeInList=pCurrent;
        //转化右子树
        if (pCurrent.right != null) {
            pLastNodeInList =convertNode(pCurrent.right,pLastNodeInList);
        }
        return pLastNodeInList;
    }
}



