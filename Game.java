import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Game{
    
  private HashMap<String, Player> players;
  private HashMap<String, Integer> amount;
  public Game(){
    Player cpu1 = new Player("cpu1");
    Player cpu2 = new Player("cpu2");
    Player cpu3 = new Player("cpu3");
    players.put("cpu1", cpu1);
    players.put("cpu2", cpu2);
    players.put("cpu3", cpu3);
  }

  private void addPlayers(String name){
    Player p = new Player(name);
    players.put(name, p);
  }

  private int bet(String name, int amt){
    Player player = players.get(name);
    int a = player.bet(amt);
    amount.put(name, a);
    return amt;
  }
  private int fold(String name){
    
  }


}