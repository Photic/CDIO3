package entity.cards;

import boundary.Out;
import entity.Player;

/**
 * Deck containing an array of chancecards
 *
 */
public class Deck {

	private ChanceCard[] cards = new ChanceCard[3]; 
	private int total, randomCard;
	
	public Deck(Out out) {
		this.cards[0] = new PayCard(out); 
		this.cards[1] = new EarnCard(out);  
		this.total = 2; 
	}
	
	/**
	 * Draw a card using math.random.
	 * @param player
	 * The player who should have the card.
	 */
	public void drawCard(Player player) {
		
		this.randomCard = (int)(Math.random()*total);
		
		cards[randomCard].useCard(player);;
		}
}