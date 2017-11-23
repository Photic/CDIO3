package entity.cards;

import entity.Player;

public class Deck {

	private Card[] cards = new Card[3]; 
	private int total; 
	private int randomCard;
	
	public Deck() {
		this.cards[0] = new PayCard(); 
		this.cards[1] = new EarnCard(); 
		this.cards[2] = new MoveManuallyCard(); 
		this.total = 3; 
	}
	
	
	// Uses a random card from the chance card pool. 
	public void drawCard(Player p) {
		
		this.randomCard = (int)(Math.random()*total)+1;
		
		cards[randomCard].useCard(p);
		
		}
}
			

//		Random random = new Random(); 
//
//public void shuffle(){
//	
//	for (int i=0; i<1000;i++) {
//		int Card1 = random.nextInt(total); 
//		int Card2 = random.nextInt(total); 
//		
//		// Stores a card before shuffling. 
//		Card storage = cards[Card1]; 
//		
//		// Swaps the cards. 
//		cards[Card1]=cards[Card2]; 
//		cards[Card2]=storage; 
//	}
//	
//}