package cardsimulationtest;


import cardsimulationmodels.*;

import java.util.ArrayList;


public class DeckMock extends Deck{

	public void getCards(ArrayList<Card> cards){
		super.cards = cards;
	}
	
	@Override
	  public void shuffle(){
		super.cards = super.cards;
	}
	
	
}
