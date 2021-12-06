/**
 * The set of properties for sale
 * 
 * @docente (João Capinha)
 * @author (Lunay Simão, Egas Israel) 
 * @version (22/11/2021)
 */
public class Listings{
    private Listing listing1;
    private Listing listing2;
    private Listing listing3;
    
    public Listings(Listing listing1, Listing listing2, Listing listing3){
        this.listing1 = listing1;
        this.listing2 = listing2;
        this.listing3 = listing3;
    }

    /**
     * Shows the listings
     */
    public void displayListings(){
        if(listing1.isSold()){
            listing1.display();
        }
        
        if(listing2.isSold()){
            listing2.display();
        }
        
        if(listing3.isSold()){
            listing3.display();
        }
    }
    
    /**
     * Shows all the listings
     */
    public void display(){
        listing1.display();
        listing2.display();
        listing3.display();
    }

    public Listing getListing1() {
        return listing1;
    }

    public Listing getListing2() {
        return listing2;
    }

    public Listing getListing3() {
        return listing3;
    }
    
    public double getListingPrice1() {
        return listing1.getPropertyPrice();
    }

    public double getListingPrice2() {
        return listing2.getPropertyPrice();
    }

    public double getListingPrice3() {
        return listing3.getPropertyPrice();
    }
}
