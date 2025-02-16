package Queue;

import java.util.Arrays;

public class card {
    public int[] deckRevealedIncreasing(int[] deck) {
        int n = deck.length;
        int[] ans = new int[n];
        Arrays.sort(deck);

        boolean skip = false;

        int i = 0 , j = 0;

        while(i < n){
            if(ans[j] == 0){

                if(!skip){
                    ans[j] = deck[i];
                    i++;
                }
                skip =! skip;
            }
            j =(j+1) % n;
        }
        return ans;

    }

    public static void main(String[] args) {

        card solution = new card();
        int[] deck = {17, 13, 11, 2, 3, 5, 7};

        int[] result = solution.deckRevealedIncreasing(deck);

        // Print the result
        System.out.print("Result: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
