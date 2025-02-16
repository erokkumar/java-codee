package priority;

import java.util.PriorityQueue;
import java.util.Queue;

public class hight {
        public int furthestBuilding(int[] heights, int bricks, int ladders) {
            Queue<Integer> minHeap = new PriorityQueue<>();
          // ontly heda
            for (int i = 1; i < heights.length; ++i) {
                final int diff = heights[i] - heights[i - 1];
                if (diff <= 0)
                    continue;
                minHeap.offer(diff);
                if (minHeap.size() > ladders)
                    bricks -= minHeap.poll();
                if (bricks < 0)
                    return i - 1;
            }

            return heights.length - 1;
        }

    public static void main(String[] args){
            hight ans =  new hight();

            int[] heighrs = {4,2,7,6,9,14,12};
            int bricks = 5;
            int ladders = 1;

            int fur = ans.furthestBuilding(heighrs , bricks , ladders);
            System.out.println("the furthest building you can reach is at index : " +  fur);
    }
}
