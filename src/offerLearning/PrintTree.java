package offerLearning;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

/**
 * Created by root on 2018/3/25.
 */
public class PrintTree {
    public static void main(String[] args) {

    }
    public static ArrayList<ArrayList<Integer>> print(TreeNode root){
        ArrayList<ArrayList<Integer>> listAll = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> list = new ArrayList<Integer>();
        Deque<TreeNode> dq = new LinkedList<TreeNode>();
        if (root == null) {
            return listAll;
        }
        dq.add(root);
        TreeNode last=root;
        TreeNode nLast=null;
        while (!dq.isEmpty()) {
            TreeNode node = dq.pollFirst();
            list.add(node.val);
            if (node.left != null) {
                nLast=node.left;
                dq.offerLast(node.left);
            }
            if (node.right != null) {
                nLast=node.right;
                dq.offerLast(node.right);
            }
            if (node == last) {
                last=nLast;
                nLast=null;
                listAll.add(list);
                list=new ArrayList<Integer>();
            }
        }
        return listAll;
    }
    class TreeNode {
        int val ;
        TreeNode left = null;
        TreeNode right = null;

         TreeNode(int val) {
            this.val = val;
        }
    }
}
