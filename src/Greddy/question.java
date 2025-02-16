package Greddy;

public class question {
    static long swapCount(String s){
        char[] chars = s.toCharArray();
        int countR = 0, countL = 0, swap = 0, imp = 0;
        for(int i =0; i<chars.length; i++){
            if (chars[i] == '['){
                countL++;
                if (imp>0){
                    swap+=imp;
                    imp--;
                }
            }
            else if(chars[i] == ']'){
                countR++;
                imp = (countR - countL);
            }
        }
        return swap;
    }
    public static void main(String[] args) {
         String s = "[][[]]";
        System.out.println(swapCount(s));
    }
}
