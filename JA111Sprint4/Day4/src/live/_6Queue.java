package live;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Queue;

public class _6Queue {
    public static void main(String[] args) {
        Queue<Integer> queue=new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        System.out.println(queue.peek());
//        System.out.println(queue.poll());
        queue.remove();
        queue.remove();
        queue.poll();
        System.out.println(queue);
    }
}
