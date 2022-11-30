package live;

import java.util.Iterator;
import java.util.Stack;

public class _4StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack();
        stack.push(5);
        stack.push(10);
        stack.push(24);
        stack.push(28);
        System.out.println(stack.peek());
        stack.pop();
//        stack.pop();

        System.out.println(stack.peek());

        // 1. way to iterate
        for(Integer element:stack){
//            System.out.println(element);
        }
        // 2. way to iterate
        Iterator it=stack.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        // 2.way to iterate
        stack.forEach((item)->System.out.println(item));
    }
}
