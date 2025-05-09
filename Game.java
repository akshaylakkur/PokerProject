import java.util.ArrayList;

public class Game{
    
  private ArrayList<Player> players;
  public Game(){
    players = null;
  }

  private void addPlayers(String name){
    Player p = new Player(name);
    players.add(p);
  }
}