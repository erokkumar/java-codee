package String;

class palandrom {
    // this question are Palandrom
    boolean isPalindrome(String s){
        StringBuilder sc = new StringBuilder(s);
        if (s.equals(sc.reverse().toString())){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        palandrom ob = new palandrom();
        String str = "nitin";
        boolean ss = ob.isPalindrome(str);
        System.out.println(ss);
    }
}
