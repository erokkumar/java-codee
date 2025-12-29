package String;

public class Palindroness {
    public static void main(String[] args) {
        String s = "level";
        String rev = "";

        for(int i = s.length() - 1; i >= 0; i--){
            rev += s.charAt(i);
        }
        if (s.equals(rev)){
            System.out.println("Palindrone");
        }else {
            System.out.println("Not Palindrone");
        }
    }
}
