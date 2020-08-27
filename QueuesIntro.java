package LearnQueues;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueuesIntro {
    public static void main(String [] args){

        // deceleration of Queue
        Queue<Integer> q = new ArrayDeque<>();

        // addition

        q.add(10);
        q.add(20);
        System.out.println(q);
        q.add(30);
        System.out.println(q);
        q.add(40);

        // remove

        q.remove();
        q.remove();
        System.out.println(q);

        // getting the peek value
        System.out.println(q.peek());
    }
}
