package interviewQuestion;

public class palandronee {
    public boolean isPlaindrome(int ple){
        int original = ple;
        int reversed = 0;

        while (ple > 0) {
            int digit = ple % 10; // Get the last digit
            reversed = reversed * 10 + digit; // Build the reversed number
            ple /= 10; // Remove the last digit
        }

        return original == reversed; // Check if original and reversed are the same

    }

    public static void main(String[] args) {
        palandronee p = new palandronee();
        //p.isPlaindrome(121);
        System.out.println("Is 121 a palindrome? " + p.isPlaindrome(121));
        int pla = 121;
    }
}
