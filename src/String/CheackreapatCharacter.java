package String;

public class CheackreapatCharacter {
    static public String nonRepeatingChar(String s){
        int n = s.length();

        for (int i = 0; i<n; i++){
            boolean found = false;
            for(int j = 0; j<n; j++){
                if(i != j && s.charAt(i) == s.charAt(j)){
                    found = true;
                    break;
                }
            }
            if (found == false)
                return String.valueOf(s.charAt(i));
        }
        return "$";

    }

    public static void main(String[] args) {
        String ch = "racecar";

        System.out.println(nonRepeatingChar(ch));
    }
}
