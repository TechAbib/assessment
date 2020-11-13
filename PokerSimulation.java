import cardsimulationmodels.Deck;
import cardsimulationmodels.Hand;
import cardsimulationmodels.HandType;

/*
import java.util.HashMap;
import java.util.Map;*/

public class PokerSimulation {



	public static void main(String[] args) {

			Deck deck = new Deck();
			
			deck.shuffle();
			System.out.println(" Shuffling … Shuffling … Shuffling …");
			
			Hand hand = new Hand(deck.dealHand(5));  // deal a 5 card hand from the top of the deck
			System.out.println("You have:" + hand);
			
			HandType handType = HandType.HIGH_CARD;

			if (hand.isFourOfAKind()) {

				handType = HandType.FOUR_OF_A_KIND;
				
			} else if (hand.isFullHouse()) {

				handType = HandType.FULL_HOUSE;
				
			} else if (hand.isThreeOfAKind()) {

				handType = HandType.THREE_OF_A_KIND;
				
			} else if (hand.isTwoPair()) {

				handType = HandType.TWO_PAIR;
				
			} else if (hand.isOnePair()) {

				handType = HandType.ONE_PAIR;
			
			} else {

				if (hand.isStraightFlush()) {
					
					handType = HandType.STRAIGHT_FLUSH;
					
				} else if (hand.isFlush()) {

					handType = HandType.FLUSH;
					
				} else if (hand.isStraight()) {

					handType = HandType.STRAIGHT;
				}

			}

			System.out.print("You have: " + handType + System.lineSeparator());
		
	}

}
