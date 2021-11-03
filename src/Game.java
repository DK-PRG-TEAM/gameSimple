public class Game {
    Player player;
    String[] gameLists = {"猜字谜游戏"};
    public Game(Player player){
        this.player = player;
    }
    public void startWordpuzzle(){
        startGame(new Wordpuzzle(this.player.getName(), this.player.getID()));
    }
    private void startGame(GameInterface gameInterface){
        gameInterface.startGame();
    }
    public void printGameList(){
        for (int i = 0; i < gameLists.length; i++){
            System.out.println(i + "\t" + gameLists[i]);
        }
    }
    public String[] getGameLists(){
        return gameLists;
    }
    public boolean startGameFromNumber(int gameNumber){
        switch (gameNumber){
            case 0 -> startWordpuzzle();
            default -> {return false;}
        }
        return true;
    }
}
