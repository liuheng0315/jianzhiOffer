package offerLearning;

/**
 * Created by root on 2018/3/11.
 */
public class RebuildTree {
    public static void main(String[] args) {
        int[] pre={1,2,3,4,5,6,7};
        int[] in={3,2,4,1,6,5,7};
        RebuildTree rt =new RebuildTree();
        TreeNode node = rt.constructBinaryTree(pre,0,pre.length-1,in,0,in.length-1);
        System.out.println(node);
        printTree(node);
    }
    public  TreeNode constructBinaryTree(int[] pre,int startPre,int endPre,int[] in,int startIn,int endIn){
        if(startPre>endPre||startIn>endIn){
            return null;
        }
        TreeNode root=new TreeNode(pre[startPre]);
        for (int i =startIn; i <=endIn ; i++) {
            if (in[i]==pre[startPre]){
                root.leftNode=constructBinaryTree(pre,startPre+1,startPre+i-startIn,in,startIn,i-1);
                root.rightNode=constructBinaryTree(pre,i-startIn+startPre+1,endPre,in,i+1,endIn);
            }
        }
        return root;
    }

    //中序遍历递归打印
   public static void printTree(TreeNode node){
                if(node!=null){
                        printTree(node.leftNode);
                        System.out.print(node.val+" ");
                        printTree(node.rightNode);
                  }
           }


    class TreeNode{
        int val;
        TreeNode leftNode;
        TreeNode rightNode;

        public TreeNode(int val) {
            this.val = val;
        }
    }
}
