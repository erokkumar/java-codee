package String;

public class Muteable {

    public static void main(String[] args) {
        StringBuffer sc = new StringBuffer("Erok");
        System.out.println(sc);
       //  StringBuffer sc = ""; invalid
        sc.append("Pandit");
        System.out.println(sc);
    }
}
