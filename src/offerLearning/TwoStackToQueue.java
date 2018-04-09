package offerLearning;

import java.util.Stack;

/**
 * Created by root on 2018/3/12.
 */
public class TwoStackToQueue {
    Stack stack1 = new Stack<Integer>();
    Stack stack2 = new Stack<Integer>();
    public static void main(String[] args) {
        TwoStackToQueue twoStackToQueue=new TwoStackToQueue();
        twoStackToQueue.push(1);
        twoStackToQueue.push(2);
        twoStackToQueue.push(3);
        System.out.println(twoStackToQueue.pop());
        System.out.println(twoStackToQueue.pop());
        System.out.println(twoStackToQueue.pop());
    }
    public  void push(int n){
        stack1.push(n);

    }
    public  int pop(){
        if (stack2.isEmpty()){
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        if (!stack2.isEmpty()){
            return (int)stack2.pop();
        }
        else {
            return -1;
        }
    }
}
