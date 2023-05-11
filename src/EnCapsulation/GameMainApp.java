package EnCapsulation;

public class GameMainApp {
    public static void main(String[] args) {
        Game g1=new Game();
        Game.Cricket cr=g1.new Cricket();
        System.out.println(g1.gameType);
        cr.gameInfo();
        System.out.println("=================");
        Game.Football f1=g1.new Football();
         f1.footballInfo();
    }
}
