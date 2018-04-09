package offerLearning;

/**
 * Created by root on 2018/3/24.
 */
public class TreeIsSymmetrical {
    public static void main(String[] args) {

    }
    public boolean isSymmetrical(TreeNode root1,TreeNode root2){
        if (root1==null&&root2==null){
            return true;
        }
        if (root1==null||root2==null){
            return false;
        }
        if (root1.val!=root2.val){
            return false;
        }
        return isSymmetrical(root1.leftNode,root2.rightNode)
                &&isSymmetrical(root1.rightNode,root2.leftNode);
    }
    class TreeNode {
        int val;
        TreeNode leftNode;
        TreeNode rightNode;

        public TreeNode(int val) {
            this.val = val;
        }
    }
}
