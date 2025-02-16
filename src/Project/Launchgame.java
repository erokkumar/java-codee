package Project;

public class Launchgame {

    public static void main(String[] args) {
        // TODO Auto-generated method stub


        Umpire u = new Umpire();
        u.collectNumFromGuesser();
        u.collectNumFromPlayer();
        u.compare();

    }
}
