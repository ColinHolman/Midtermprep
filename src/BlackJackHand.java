
import java.util.ArrayList;
import java.util.Collections;

public class BlackJackHand {

    private ArrayList <BlackJackCard> cards;
    private int size;

    public BlackJackHand(int size) {
        this.size = size;
    }

    public void displayHand()
    {
        
    }
    
    public void shuffle()
    {
        Collections.shuffle(cards);
    }
    
    public ArrayList<BlackJackCard> showCards()
    {
        return cards;
    }
    /**
     * @return the size
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(int size) {
        this.size = size;
    }
    
    

	

}