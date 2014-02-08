import java.util.Set;
import java.util.TreeSet;

// A class to describe each player who is within a game
public class Player {
	
	public Pile hand;			// player's hand, accessible outside 
	private String name;		// name of player
	private boolean isDealer;	// whether player is the current dealer, not sure if needed
	
	// constructor
	public Player(String name) {
		this.name = name;
		isDealer = false;
		Set<String> temp = new TreeSet<String>(); // Set containing only player's name
		temp.add(name);
		hand = new Pile(false, 0, 0, temp);       // New hand viewable by player
	}
	
	// Returns name
	public String getName() {
		return name;
	}
	
	// Sets name to passed in String
	public void setName(String name) {
		this.name = name;
	}
	
	// returns if player is the dealer
	public boolean getDealer() {
		return isDealer;
	}
	
	// sets player to either be dealer or not be dealer
	public void setDealer(boolean isDealer) {
		this.isDealer = isDealer;
	}

}
