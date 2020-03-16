public class BlackJackCard {
        
        public enum Suit {CLUBS, DIAMONDS, HEARTS, SPADES};
        public enum Value {ACE, ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING};
    
	private Suit suits;
	private Value value;

	public BlackJackCard() {}

	/**
	 * 
	 * @param s
	 * @param v
	 */
	public BlackJackCard(Suit s, Value v) {
            suits = s;
            value = v;
	}

	public Suit getSuits() {
            return this.suits;
	}

	/**
	 * 
	 * @param suits
	 */
	public void setSuits(Suit suits) {
		this.suits = suits;
	}

	public Value getValue() {
		return this.value;
	}

	/**
	 * 
	 * @param value
	 */
	public void setValue(Value value) {
		this.value = value;
	}
        
        public String toString()
        {
            return value +" of " + suits;
        }
        
        

}