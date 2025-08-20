package interviewQuestion;

public class revstring {
    public char[] reverseString(char [] s){
        int left = 0 , right  = s.length - 1;
        while(left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
        return s;
    }
    public static void main(String[] args) {
        char[] str = {'h', 'e', 'l', 'l', 'o'};
        revstring ob = new revstring();
        ob.reverseString(str);
        System.out.println(str);
        int x = 123;
        
        System.out.println(x/10 + " " + x%10);
        while (x != 0) {
            int digit = x % 10;
            System.out.print(digit);
            x /= 10; // Remove the last digit
        }
    }
}
