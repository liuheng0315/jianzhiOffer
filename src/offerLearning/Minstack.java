package offerLearning;

import java.util.Stack;

/**
 * Created by root on 2018/3/26.
 */
public class Minstack {
    public static void main(String[] args) {
        Minstack ms = new Minstack();
        ms.push(3);
        System.out.println(ms.min());
    }

    Stack<Integer> stack = new Stack<Integer>();
    Stack<Integer>  minStack=new Stack<Integer>();
    public void push(int node) {
        if (minStack.isEmpty()){
            minStack.push(node);
        }else {
            int top=minStack.peek();
            if (top >=node) {
                minStack.push(node);
            }else {
                minStack.push(top);
            }
        }
        stack.push(node);
    }

    public void pop() {
        if (!stack.isEmpty()){
            stack.pop();
            minStack.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int min() {
        return minStack.peek();
    }
}
