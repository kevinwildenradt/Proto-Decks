
import java.util.*;
//ayoh
public class test {
	public static void main(String [ ] args) {
		Set<String> players = new TreeSet<String>();
		players.add("Steve");
		players.add("Jim");
		players.add("Bob");
		Deck deck = new Deck(false, 0, 0, players);
		deck.shuffle();
		System.out.println(deck);
		Map hands = new TreeMap<String, Pile>();
		for(String player: players) {
			Set temp = new TreeSet<String>();
			temp.add(player);
			hands.put(player, new Pile(false, 0, 0, temp));
		}
		System.out.println(deck);
		System.out.println(players);
		Pile discardPile = new Pile(true, 0, 0, players);
		PlaySpace playSpace = new PlaySpace(players);
      System.out.println(playSpace);
		deck.deal(7, hands);
		System.out.println(deck);
		for (String player : players) {
			System.out.println(hands.get(player));
			((Pile) hands.get(player)).remove();
			
		}
	}

}
