import java.util.ArrayList;
import java.util.HashMap;

public class Game{
    
  private HashMap<String, Player> players;
  public Game(){
    players = null;
  }

  private void addPlayers(String name){
    Player p = new Player(name);
    players.put(name, p);
  }
  

}