package Queue;

import org.jetbrains.annotations.NotNull;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class tryal {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);

        System.out.println("Queue: " + queue); // Output: Queue: [10, 20, 30]

        int removedElement = queue.poll();
        System.out.println("Removed Element: " + removedElement); // Output: Removed Element: 10
        System.out.println("Queue after poll: " + queue); // Output: Queue after poll: [20, 30]

        int peekedElement = queue.peek();
        System.out.println("Peeked Element: " + peekedElement); // Output: Peeked Element: 20
        System.out.println("Queue after peek: " + queue); // Output: Queue after peek: [20, 30]

        boolean isEmpty = queue.isEmpty();
        System.out.println("Is queue empty? " + isEmpty);
    }
}
