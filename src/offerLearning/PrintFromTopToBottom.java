package offerLearning;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by root on 2018/3/17.
 */
public class PrintFromTopToBottom {
    public static void main(String[] args) {

    }
    public static ArrayList print(TreeNode root){
        ArrayList arrayList = new ArrayList<Integer>();
        if (root == null) {
            return arrayList;
        }
        ArrayList<TreeNode> queue = new ArrayList<TreeNode>();
        queue.add(root);
        while (queue.size()>0){
            TreeNode node = queue.remove(0);
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
            arrayList.add(node.val);
        }
        return arrayList;
    }
    class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }
    }
}
