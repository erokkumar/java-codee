package String;

public class Mutetable3 {
    public static void main(String[] args) {

        StringBuffer sc = new StringBuffer(); // if you create StringBuffer this capicity are 16. as like
                                              // as like 16 charter add the one time

        System.out.println(sc.capacity()); // 16
        String sentence = "Think Twice";
        String[] words = sentence.split(" ");
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.reverse()); // 16

    }
}
