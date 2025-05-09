import java.util.ArrayList;

public class Game{
    
  private ArrayList<Player> players;
  public Game(){
    players = null;
  }

  private void addPlayers(Player p){
    players.add(p);
  }
}