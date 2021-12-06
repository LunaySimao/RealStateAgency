/**
 * Real State Agency that raises and sell properties
 * 
 * @docente (João Capinha)
 * @author (Lunay Simão, Egas Israel) 
 * @version (22/11/2021)
 */
public class RealStateAgency{
    private Agent agent1;
    private Agent agent2;
    private Listing listing1;
    private Listing listing2;
    private Listing listing3;
    private Listings listings;
    private static String AGENCYNAME = "Remax"; //The name of the agency is the same for everyone 
    private double profit;
    
    public RealStateAgency(Listing listing1, Listing listing2,Listings listings, Agent agent1, Agent agent2){
        Adress adress = null;
        this.listing1 = listing1;
        this.listing2 = listing2;
        this.listing3 = null;        
        this.listings = listings;
        
        this.agent1 = agent1;
        this.agent2 = agent2;        
        
        this.profit = 0.0;
    }
    
    /**
     * Register a new property for sale
     * @param listing -> The house received by parameter
     */
    public void addListing(Listing listing){
        if(isAcceptingListings()){
            this.listing3 = listing;
        }
    }  
    
    /**
     * Method that has the responsibility to sell a property
     * @param listing -> The house to be sold
     */
    public void sellListing(Listing listing){
        listing.changePurchaseStatus(true);
        this.profit = profit + (0.03 * listing.getPropertyPrice());
    }
    
    /**
     * Shows the listings
     */
    public void displayListings(){
        agent1.displayListings();
    }
    
    /**
     *  Show properties for sale according to the name of a city
     * @param name ->  Show properties for sale according to the name of a city
     */
    public void displayListingsLocatedAt(String city){
        if(listing1.getAdress().getCity().equalsIgnoreCase(city)){
            listing1.display();
        }
        
        if(listing2.getAdress().getCity().equalsIgnoreCase(city)){
            listing2.display();
        }
        
        if(listing3 != null){
            if(listing3.getAdress().getCity().equalsIgnoreCase(city)){
            listing3.display();
            }
        }
    }
    
    /**
     * Shows the listings with backyards
     * @param price1 -> min price
     * @param price2 -> max price
     */
    public void displayListingsBetwenn(Listing listing1, Listing listing2, Listing listing3,double price1, double price2){
        if(listing1.getPropertyPrice() >= price1 && listing1.getPropertyPrice() <= price2){
            listing1.display();
        }
        
        if(listing2.getPropertyPrice() >= price1 && listing2.getPropertyPrice() <= price2){
            listing2.display();
        }
        
        if(listing3 != null){
            if(listing3.getPropertyPrice() >= price1 && listing3.getPropertyPrice() <= price2){
            listing3.display();
            }
        }
        
    }
    
    /**
     * Show properties with backyards for sale
     * @param listing1
     * @param listing2
     * @param listing3 
     */
    public void displayListingsWithYard(Listing listing1, Listing listing2, Listing listing3){
        if(listing1.getHouseData().getBackyardPresence()){
            listing1.display();
        }
        
        if(listing2.getHouseData().getBackyardPresence()){
            listing2.display();
        }
        
        if(listing3.getHouseData().getBackyardPresence()){
            listing3.display();
        }
    }
    
    /**
     * Checks to see if you can still add rooms
     * @return 
     */
    public boolean isAcceptingListings(){
        return (listing1 == null || listing2 == null || listing3 == null) || 
                (listing1 == null && listing2 == null) || 
                (listing1 == null && listing3 == null) || 
                (listing2 == null && listing3 == null) ? true : false;
        //Visto que o agente só recebe 2 imóveis, garantimos que só pode aceitar um nóvo, se dentre os 3 objetos, tiverem pelo menos 2 nulos
        //Dessa maneira sabemos que ou ele não´imóveis, ou tem 1 imóvel, e assim ainda pelo receber pelo menos 1 imóvel, casa já tenha outro imóvel, totalizando os 2 imóveis
    }
    
    /**
     * Método que mostra a informação da imobiliária
     */
    public void display(){
        System.out.println("\t\t " + getAgencyName());
        //listings.displayListing();
        System.out.println("\t\t\t\t\t");
        listing1.display();
        listing2.display();
        if(listing3 != null){
            listing3.display();
        }
        System.out.println();
        System.out.println(agent1.getAgentName() + "\t" + agent2.getAgentName());
        System.out.println("\t\t\t\t\t\t" + getProfit() + "€  Profit");
        
    }
    
    public double getProfit(){
        return profit;
    }
    
    public String getAgencyName(){
        return AGENCYNAME;
    }

    public Agent getAgent1() {
        return agent1;
    }

    public Agent getAgent2() {
        return agent2;
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

    public Listings getListings() {
        return listings;
    }
}