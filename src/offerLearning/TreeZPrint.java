package offerLearning;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by root on 2018/3/24.
 */
public class TreeZPrint {
    static ArrayList<ArrayList<Integer>> listAll = new ArrayList<ArrayList<Integer>>();
    static ArrayList<Integer> list = new ArrayList<Integer>();
    public static void main(String[] args) {

    }
    public static ArrayList<ArrayList<Integer> > printByZig(TreeNode root){
        ArrayList<ArrayList<Integer>> listAll = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> list;
        if (root == null) {
            return listAll;
        }
        Deque<TreeNode> dq=new LinkedList<TreeNode>();
        boolean lr=true;
        TreeNode last=root;
        TreeNode nLast=null;
        dq.offerFirst(root);
        list=new ArrayList<Integer>();
        while (!dq.isEmpty()){
            if (lr) {
                root = dq.pollFirst();
                list.add(root.val);
                if (root.leftNode != null) {
                    nLast = nLast == null ? root.leftNode : nLast;
                    dq.offerLast(root.leftNode);
                }
                if (root.rightNode != null) {
                    nLast = nLast == null ? root.rightNode : nLast;
                    dq.offerLast(root.rightNode);
                }
            } else {
                root=dq.pollLast();
                list.add(root.val);
                if (root.rightNode != null) {
                    nLast=nLast==null?root.rightNode:nLast;
                    dq.offerFirst(root.rightNode);
                }
                if (root.leftNode!= null) {
                    nLast=nLast==null?root.leftNode:nLast;
                    dq.offerFirst(root.leftNode);
                }
            }
            if(root==last){
                listAll.add(list);
                list=new ArrayList<Integer>();
            }
            if (root==last&&!dq.isEmpty()){
                lr=!lr;
                last=nLast;
                nLast=null;
            }
        }
        return listAll;
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
