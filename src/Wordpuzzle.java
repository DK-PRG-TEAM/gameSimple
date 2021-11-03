//(简答题) 举出语法复习：
//        猜数字游戏。猜一个随机生成的1-100的数字。
//        输出姓名，学号。

import java.util.Scanner;

public class Wordpuzzle implements GameInterface {
    private String playerName;
    private String playerID;
    private int maxGameHP = 20;
    private int gameHP;
    private int randomNumber;

    public Wordpuzzle(){}

    public Wordpuzzle(String playerName, String playerID){
        this.playerName = playerName;
        this.playerID = playerID;
    }

    private void printLine(){
        System.out.println("---------------------------------");
    }
    private void printWelcome(){
        System.out.println("Hi, " + this.playerName + ", 又是一个新面孔, 欢迎你!");
        System.out.println("您的游戏ID为: " + this.playerID);
    }
    private void printGameRule(){
        System.out.println("游戏规则: ");
        System.out.println("\t猜数字游戏。");
        System.out.println("\t猜一个随机生成的1-100的数字, 你输入一个数字和随机的数字进行比较, 每次告诉你猜高了或者低了.");
        System.out.println("\t你一共有[" + this.gameHP + "]此机会!");
    }
    private void printWin(){
        System.out.println("恭喜你! 猜中了这个随机数! 在这个过程中, 你一共猜了[" + (this.maxGameHP - this.gameHP + 1) + "]次!");
    }
    private void printLost(){
        System.out.println("游戏失败... 你耗尽了所有次数...");
    }
    private void initGame(){
        this.gameHP = maxGameHP;
        this.randomNumber = (int)(Math.random() * 100 + 1);
    }
    public void startGame(){
        initGame();
        printWelcome();
        printLine();
        printGameRule();
        printLine();
        gameMain();
    }
    private void endGame(boolean isWin){
        if (isWin){
            printWin();
        }else {
            printLost();
        }
        while (true){
            Scanner sin = new Scanner(System.in);
            System.out.print("是否继续游戏?[y/n]");
            char inputOption = sin.nextLine().charAt(0);
            if (inputOption == 'y'){
                startGame();
                break;
            }else if (inputOption == 'n'){
                break;
            }
        }
    }
    private int getInput(){
        return new Scanner(System.in).nextInt();
    }
    private void gameMain(){
        while (true){
            if (this.gameHP > 0){
                System.out.print("请输入一个数字: ");
                int inputNum = getInput();
                if ((inputNum != this.randomNumber)){
                    if (inputNum > this.randomNumber){
                        System.out.println("你输入的数字大了!");
                    }else {
                        System.out.println("你输入的数字小了!");
                    }
                }else {
                    this.endGame(true);
                    break;
                }
                this.gameHP--;
            }else {
                this.endGame(false);
            }
        }
    }
}
