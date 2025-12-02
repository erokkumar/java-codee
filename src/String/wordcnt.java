package String;

import java.util.HashMap;
import java.util.Map;

public class wordcnt {
    public static void main(String[] args) {
        String[] str = {"India","Usa","Usa","India","Nepal","SriLanka",
                        "South Africa","SriLanka","South Africa","Nepal"};
        HashMap<String,Integer> map = new HashMap<>();

        for (String word : str) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        System.out.println(map);
    }
}
