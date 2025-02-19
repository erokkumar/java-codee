package String;

import java.util.ArrayList;
import java.util.List;

public class Allsubstring {

    public static List<String> findSubstrings(String s){

        List<String> ss = new ArrayList<>();
        int n = s.length();
        for (int i = 0; i<n; i++){
            for (int j = i; j<n; j++){
                ss.add(s.substring(i , j+1));
            }
        }return ss;
    }
    public static void main(String[] args) {
        String s = "abc";
        List<String> ss = findSubstrings(s);
        for(String i : ss){
            System.out.println(i + " ");
        }
    }
}
