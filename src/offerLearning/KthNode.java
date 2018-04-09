package offerLearning;

import sun.reflect.generics.tree.Tree;

/**
 * Created by root on 2018/3/24.
 */
public class KthNode {
    int j;
    public static void main(String[] args) {
        TreeNode node5=new TreeNode(5);
        TreeNode node7=new TreeNode(7);
        TreeNode node9=new TreeNode(9);
        TreeNode node11=new TreeNode(11);
        TreeNode node6=new TreeNode(6);
        TreeNode node10=new TreeNode(10);
        TreeNode node8=new TreeNode(8);
        node8.left=node6;
        node8.right=node10;
        node6.left=node5;
        node6.right=node7;
        node10.left=node9;
        node10.right=node11;
        KthNode kth=new KthNode();
        TreeNode node = kth.findKthNode(node8,2);
        System.out.println(node.val);
    }
    public TreeNode findKthNode(TreeNode root, int k){
        j=k;
        TreeNode target=null;
        if (root.left != null) {
            target=findKthNode(root.left,j);
        }
        if (target==null){
            if(j==1){
                target=root;
            }
            --j;
        }
        if (target == null&&root.right!=null) {
            target=findKthNode(root.right,j);
        }
        return target;
    }
    static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }
    }
}
