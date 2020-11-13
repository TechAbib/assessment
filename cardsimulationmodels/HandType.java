package cardsimulationmodels;

public enum HandType {

	STRAIGHT_FLUSH("Straight Flush"), STRAIGHT("Straight"), FLUSH("Flush"),

	FOUR_OF_A_KIND("Four-of-a-Kind"), FULL_HOUSE("Full House"), THREE_OF_A_KIND("Three-of-a-Kind"),
	TWO_PAIR("Two Pair"), ONE_PAIR("One Pair"), HIGH_CARD("Nothing");

	private String label;

	HandType(String label) {
		this.label = label;
	}

	public String getLabel() {
		return this.label;
	}
}
