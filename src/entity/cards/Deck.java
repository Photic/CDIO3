package entity.cards;

import java.util.Random;

import entity.Player;

public class Deck {

	private Card[] cards = new Card[3]; 
	private int total; 
	private int currentCard = 0; 
	
	public Deck() {
		this.cards[0] = new PayCard(); 
		this.cards[1] = new EarnCard(); 
		this.cards[2] = new MoveManuallyCard(); 
		this.total = 3; 
	}
	
	Random random = new Random(); 
	
	public void shuffle(){
		
		for (int i=0; i<1000;i++) {
			int Card1 = random.nextInt(total); 
			int Card2 = random.nextInt(total); 
			
			// Stores a card before shuffling. 
			Card storage = cards[Card1]; 
			
			// Swaps the cards. 
			cards[Card1]=cards[Card2]; 
			cards[Card2]=storage; 
		}
		
	}
	
	// Draws and plays the next card, as well as placing the card at the bottom of the deck. 
	public void next(Player p) {
		Card storage = cards[currentCard]; 
		
		cards[currentCard].useCard(p);
		currentCard++; 
		
		// Resets the deck if the last card i drawn. 
		if (currentCard == total) {
			currentCard = 0; 
		}
		
	}
	
	
}
