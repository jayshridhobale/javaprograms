package QueueFrameWork;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
public class QueueDemo1 {
    public static void main(String[] args) {
        Queue<Integer> data = new PriorityQueue<>();
        data.offer(25);
        data.offer(30);
        data.offer(45);
        System.out.println(data);
        System.out.println("Head " +data.peek());
        data.poll();
        System.out.println("Head " +data.peek());
        data.poll();
        System.out.println("Head " +data.peek());
        data.poll();
        System.out.println("Head " +data.peek());

    }
}
