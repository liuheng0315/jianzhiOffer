package offerLearning;

/**
 * Created by root on 2018/3/15.
 */
public class HasSubTree {
    public static void main(String[] args) {

    }
    public static Boolean hasTree(TreeNode root1,TreeNode root2){
        boolean result=false;
        if (root1 != null&&root2 != null) {
            if (root1.val == root2.val) {
                result=hasBtreeInAtree(root1,root2);
            }
            if (!result) {
                result=hasTree(root1.left,root2);
            }
            if (!result) {
                result=hasTree(root1.right,root2);
            }
        }

        return result;
    }

    public static Boolean hasBtreeInAtree(TreeNode root1,TreeNode root2){
        if (root2==null){
            return true;
        }
        if (root1==null){
            return false;
        }
        if (root1.val != root2.val) {
            return false;
        }
        return hasBtreeInAtree(root1.left,root2.left)&&hasBtreeInAtree(root1.right,root2.right);
    }

    class TreeNode{
        int val;
        TreeNode left=null;
        TreeNode right=null;
        public TreeNode(int val) {
            this.val = val;
        }
    }
}
