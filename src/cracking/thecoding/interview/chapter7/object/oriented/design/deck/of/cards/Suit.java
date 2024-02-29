package cracking.thecoding.interview.chapter7.object.oriented.design.deck.of.cards;

public enum Suit {
	Club (0), Diamonds (1), Heart (2), Spade (3);
	private int value;
	private Suit(int v) { value = v; }
	public int getValue() { return value; }
}
