import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class priorityqueue1 {
    public static void main(String[] args) {
        //PriorityQueue<Integer> p = new PriorityQueue<>();
        ArrayDeque<Integer> p = new ArrayDeque<>();
        //PriorityQueue
        p.offer(10);
        p.offer(30);
        p.offer(5);
        System.out.println(p);
        p.poll();
        System.out.println(p);
        p.remove(5);
        System.out.println(p);
        p.offer(40);
        System.out.println(p.peek());
        p.remove();
        System.out.println(p);
        System.out.println(p.isEmpty());
        //p.clear();
        p.add(2);
        System.out.println(p.size());
        System.out.println(p.contains(5));
        System.out.println(p);

        //ArrayDeque
        p.push(4);
        p.push(10);
        p.push(44);
        System.out.println(p);
        p.pop();
        System.out.println(p);
        p.offerFirst(33);
        p.offerLast(66);
        System.out.println(p);
        p.pollFirst();
        System.out.println(p);
        p.pollLast();
        System.out.println(p);
        System.out.println(p.contains(44));
        System.out.println(p.getLast());
        System.out.println(p.peek());
    }
}
