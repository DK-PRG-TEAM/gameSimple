import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Player anying = new Player("万宇晨", "20203101019");
        Game game = new Game(anying);
        game.printGameList();
        Scanner sin = new Scanner(System.in);
        System.out.print("请输入游戏序号: ");
        game.startGameFromNumber(sin.nextInt());
    }
}