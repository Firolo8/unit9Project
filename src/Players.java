public class Players extends Teams {

    private String playerName;

    public Players(String conference, String division, String teamName, String playerName) {
        super(conference, division, teamName);
        this.playerName = playerName;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }


    public String toString() {
        return super.toString() + ", Player: " + playerName;
    }


    public boolean equals(Players obj) {
        if (this.playerName.equals(obj.getPlayerName())){
            return true;
        }
        else{
            return false;
        }
    }


    public void uniqueMethod1() {
        System.out.println("Position of " + playerName + ": Point Guard");
    }


    public void uniqueMethod2() {
        System.out.println("Jersey Number of " + playerName + ": 35");
    }
}
