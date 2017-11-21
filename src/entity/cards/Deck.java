package entity.cards;

import java.util.Random;

public class Deck {

	private Card[] cards = new Card[3]; 
	private int total; 
	
	public Deck() {
		this.cards[0] = new PayCard(); 
		this.cards[1] = new EarnCard(); 
		this.cards[2] = null; 
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
	
	
}
