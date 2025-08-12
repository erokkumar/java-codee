package Leetcode;

import java.util.Arrays;
import java.util.List;

public class matches {
    public static void main(String[] args) {
        List<String> mat = Arrays.asList("3:4", "5:3" , "2:2", "1:0", "4:5", "3:3", "6:2", "0:1", "2:3", "4:4");
        int team_x = 0, team_y = 0;

        int sc = 0;
        for(String ch : mat){
            String[] parts = ch.split(":");
            int x = Integer.parseInt(parts[0]);
            int y = Integer.parseInt(parts[1]);

            if(x > y){
                team_x += 3;
                team_y -= 1;
            } else if (x < y) {
                team_y += 3;
                team_x -= 1;
            }
            else {
                team_x += 1;
                team_y += 1;
            }

        }System.out.println("Match:" + "Team X:" + team_x + "Team Y:" + team_y);
    }
}
