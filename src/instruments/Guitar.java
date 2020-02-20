package instruments;

/**
 *This class +++Insert Description Here+++
 *
 * @author Colin Holman
 */
public class Guitar extends StringInstrument {
    
    private String Color;

    public Guitar() {
    }

    public Guitar(String strings, String neck, String body, String model) {
        super(strings, neck, body, model);
    }    
    /**
     * @return the Color
     */
    public String getColor() {
        return Color;
    }

    /**
     * @param Color the Color to set
     */
    public void setColor(String Color) {
        this.Color = Color;
    }
    
    public void notes()
    {
        System.out.println(" will play in d#");
    }
    

}
