package Leetcode;

public class blackwh {

        public int minimumRecolors(String blocks, int k) {
            int cnt = 0 , r =0;
            int min = Integer.MAX_VALUE;
            String ans = "";
            for(int i = 0; i<blocks.length(); i++){
                if(blocks.charAt(i) == 'W' ){
                    cnt++;
                }
                if(i >= k){
                    if(blocks.charAt(i - k) == 'W'){
                        cnt--;
                    }
                }
                if (i >= k - 1) {
                    min = Math.min(min, cnt);
                }
            }return min;
        }

    public static void main(String[] args) {
        blackwh ob = new blackwh();
        String str = "WBBWWBBWBW";
        int k = 7;
        int result = ob.minimumRecolors(str, k);
        System.out.println("Minimum recolors needed: " + result);
    }
}
