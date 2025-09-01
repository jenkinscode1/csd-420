import java.util.ArrayList;

public class TestArrayList {

    public static ArrayList<String> getNFLPlayers() {
        ArrayList<String> players = new ArrayList<>();

        players.add("Baker Mayfield");
        players.add("Mike Evans");
        players.add("Chris Godwin");
        players.add("Lavonte David");

        players.add("Dak Prescott");
        players.add("CeeDee Lamb");
        players.add("Micah Parsons");
        players.add("Tony Pollard");

        return players;
    }

    public static void main(String[] args) {
        ArrayList<String> nflPlayers = getNFLPlayers();
        System.out.println("NFL Players (Bucs & Cowboys): " + nflPlayers);
    }
}