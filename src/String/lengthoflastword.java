package String;

public class lengthoflastword {
    public int lengthWord(String s){
        s = s.trim();

        int last = s.lastIndexOf(' ');
        String lastWord = s.substring(last + 1);
        return lastWord.length();
    }
    public static void main(String[] args) {
        lengthoflastword lw = new lengthoflastword();
        String s = "Hello World";
        int length = lw.lengthWord(s);
        System.out.println("Length of the last word: " + length);
    }
}
