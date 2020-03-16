/**
 *This class will gather the information of the player playing the game.
 *
 * @author Colin Holman, Vishnav Akavaram, Aditya Gadgil
 */
public class Player {
    
    private String playerID;

    //Constructor to set the players ID number
    public Player(String playerID) {
        this.playerID = playerID;
    }

    /**
     * @return the playerID
     */
    public String getPlayerID() {
        return playerID;
    }

    /**
     * @param playerID the playerID to set
     */
    public void setPlayerID(String playerID) {
        this.playerID = playerID;
    }
    
    

}
