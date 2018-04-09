package offerLearning;

/**
 * Created by root on 2018/3/25.
 */
public class SerializeTree {
    int index=-1;
    public static void main(String[] args) {

    }
    public  String serialize(TreeNode root){
        StringBuffer sb=new StringBuffer();
        if (root == null) {
            sb.append("#,");
            return sb.toString();
        }
        sb.append(root.val+",");
        sb.append(serialize(root.left));
        sb.append(serialize(root.right));
        return sb.toString();
    }
    public  TreeNode deSerialize(String str){
        index++;
        int len=str.length();
        if (index>=len){
            return null;
        }
        String[] split = str.split(",");
        TreeNode node=null;
        if (!split[index].equals("#")){
            node = new TreeNode(Integer.parseInt(split[index]));
            node.left = deSerialize(str);
            node.right = deSerialize(str);
        }
        return node;
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
