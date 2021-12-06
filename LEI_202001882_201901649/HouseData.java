/**
 * Used to save property details
 * 
 * @docente (João Capinha)
 * @author (Lunay Simão, Egas Israel) 
 * @version (22/11/2021)
 */
public class HouseData{
    private Adress adress1;
    private double surface;
    private boolean ispresent;

    public HouseData(double length, double width, boolean ispresent, Adress adress1){        
        if(validadeArea(length, width)){
            this.surface = length * width;        
        }
        
        if(adress1 != null){
            this.adress1 = adress1;
        }        
        this.ispresent = ispresent;
    }
    
    public HouseData(double length, double width, Adress adress1){        
        if(validadeArea(length, width)){
            this.surface = length * width;        
        }
        
        if(adress1 != null){
            this.adress1 = adress1;
        }        
        this.ispresent = false;
    }
    
    /**
     * Shows the adress of the house
     */
    public void displayAdress(){
        adress1.display();
    }
    
    /**
     * Validates the values received to calculate the area
     * @param length - the received length
     * @param width  - the received width
     * @return truth if it goes well otherwise false
     */
    public boolean validadeArea(double length, double width) {
        return (length > 0 && width > 0) ? true : false;
    }
    
    public double getSurface(){
        return surface;
    }
    
    public boolean getBackyardPresence(){
        return ispresent;
    }
    
    public void setSurface(double length, double width) {
        if(validadeArea(length, width)){
            this.surface = length * width;
        }
    }
    
    public void setBackyardPresence(boolean isBackyardPresence){
        this.ispresent = isBackyardPresence;
    }
}