package offerLearning;

import java.util.Stack;

/**
 * Created by root on 2018/3/26.
 */
public class StackIsPopOrder {
    public static void main(String[] args) {

    }
    public boolean isPopOrder(int[] pushA,int[] popA){
        if (pushA.length==0||popA.length==0){
            return false;
        }
        Stack<Integer> stack = new Stack<>();
        //用于标识弹出列的位子
        int popIndex=0;
        for (int i = 0; i <pushA.length ; i++) {
            stack.push(pushA[i]);
            //如果栈不为空，且栈顶元素等于弹出序列
            while (!stack.isEmpty() && stack.peek() == popA[popIndex]) {
                stack.pop();
                popIndex++;
            }
        }
        return stack.isEmpty();
    }
}
