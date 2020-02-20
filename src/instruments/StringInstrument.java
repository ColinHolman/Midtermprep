package instruments;

/**
 *This class +++Insert Description Here+++
 *
 * @author Colin Holman
 */
public class StringInstrument{
    
    private String strings;
    private String neck;
    private String body;
    private String model;

    public StringInstrument(){
        
    }
    
    public StringInstrument(String strings, String neck, String body, String model) {
        this.strings = strings;
        this.neck = neck;
        this.body = body;
        this.model = model;
    }
    
    /**
     * @return the strings
     */
    public String getStrings() {
        return strings;
    }

    /**
     * @param strings the strings to set
     */
    public void setStrings(String strings) {
        this.strings = strings;
    }

    /**
     * @return the neck
     */
    public String getNeck() {
        return neck;
    }

    /**
     * @param neck the neck to set
     */
    public void setNeck(String neck) {
        this.neck = neck;
    }

    /**
     * @return the body
     */
    public String getBody() {
        return body;
    }

    /**
     * @param body the body to set
     */
    public void setBody(String body) {
        this.body = body;
    }
    
    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }
    
    public String toString()
    {
        return "This is a " + model + ", it has " + strings + " Strings, a " + body + " body, and a "+ neck + " neck.";
    }

    
    
    

}
