package EnCapsulation;

public class Game {
    String gameType="Game Type is : Ground";
    class Cricket{
        String gameName="cricket";
        public void gameInfo(){
            System.out.println("Game name is :"+gameName);
        }
    }
    class Football{
        int playerSize=8;
        public void footballInfo(){
            System.out.println("Player size is :"+playerSize);
        }
    }
}
