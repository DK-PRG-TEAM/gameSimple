import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Player anying = new Player("某同学", "00000000000");
        Game game = new Game(anying);
        game.printGameList();
        Scanner sin = new Scanner(System.in);
        System.out.print("请输入游戏序号: ");
        game.startGameFromNumber(sin.nextInt());
    }
}