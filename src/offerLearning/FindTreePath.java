package offerLearning;

import java.util.ArrayList;

/**
 * Created by root on 2018/3/22.
 */
public class FindTreePath {
    ArrayList<ArrayList<Integer>> listAll = new ArrayList<ArrayList<Integer>>();
    ArrayList<Integer> list =new ArrayList<Integer>();
    public static void main(String[] args) {

    }
    public  ArrayList<ArrayList<Integer>> findPath(TreeNode root,int target){
        if (root == null) {
            return listAll;
        }
        target-=root.val;
        list.add(root.val);
        if (0 == target&&root.left==null&&root.right==null) {
            listAll.add(new ArrayList<Integer>(list));
        }
        findPath(root.left,target);
        findPath(root.right,target);
        list.remove(list.size()-1);
        return listAll;
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
