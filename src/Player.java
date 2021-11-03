public class Player {
    private String playerName;
    private String playerID;
    public Player(String playerName, String playerID){
        this.playerName = playerName;
        this.playerID = playerID;
    }
    public String getName(){
        return this.playerName;
    }
    public String getID(){
        return this.playerID;
    }
}
