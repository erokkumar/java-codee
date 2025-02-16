package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class ticket {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int n = tickets.length;
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            queue.add(i);
        }

        int time = 0;

        while (!queue.isEmpty()) {
            time++;
            int front = queue.poll();
            tickets[front]--;

            if (front == k && tickets[front] == 0) {
                return time;
            }

            if (tickets[front] > 0) {
                queue.add(front);
            }
        }

        return time;
    }

    public static void main(String[] args) {
        // Example test case
        int[] tickets = {5,1,1,1};
        int k = 0;

        // Create an instance of Solution
        ticket solution = new ticket();

        // Call the timeRequiredToBuy method and get the result
        int time = solution.timeRequiredToBuy(tickets, k);

        // Output the result
        System.out.println("Time required for position " + k + ": " + time);
    }
}
