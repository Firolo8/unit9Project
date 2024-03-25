import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Nba> listOfNba = new ArrayList<>();

        Nba n1 = new Nba();
        Teams t1 = new Teams("Western Conference", "Pacific Division", "Golden State Warriors");
        Teams t2 = new Teams("Eastern Conference", "Atlantic Division", "Phoenix Suns");
        Players p1 = new Players("Western Conference", "Pacific Division", "Golden State Warriors", "Stephen Curry");
        Players p2 = new Players("Eastern Conference", "Atlantic Division", "Phoenix Suns", "Kevin Durant");

        listOfNba.add(n1);
        listOfNba.add(t1);
        listOfNba.add(t2);
        listOfNba.add(p1);
        listOfNba.add(p2);

        // examples for aliasing and cloaking
        Nba t1Cloak = t1;
        Nba p1Alias = p1;

        listOfNba.add(t1Cloak);
        listOfNba.add(p1Alias);

        for (Nba nba : listOfNba) {
            System.out.println(nba);
        }
    }
}
