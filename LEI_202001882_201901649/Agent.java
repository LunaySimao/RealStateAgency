/**
 * A real state agente who sells real state for a financial fee
 * 
 * @docente (João Capinha)
 * @author (Lunay Simão, Egas Israel) 
 * @version (22/11/2021)
 */
public class Agent{
    private Listing listing1;
    private Listing listing2;
    private Listing listing3;
    private String agentName;
    private double totalReceivedInCommissions;
    private int numberOfPropertiesSold;
    private boolean isAcceptingListings;
    private boolean isSold;
    
    public Agent(String agentName, Listing listing1, Listing listing2){
        this.listing1 = listing1;
        this.listing2 = listing2;
        this.listing3 = null;
        totalReceivedInCommissions = 0.0;
        numberOfPropertiesSold = 0;
        isSold = false;
        isAcceptingListings = true;
        if(agentName != null){
            this.agentName = agentName;
        }else {
            this.agentName = "";
        }
    }    
    
    /**
     * Information about a particular agent
     */
    public void display(Agent agent){
        System.out.println(agent.getAgentName());
        System.out.println("\t\t\t\t" + getTotalReceivedInCommissions());
        System.out.println("\t\t\t\t Comissões \n");
        agent.getListing1().display();
        agent.getListing2().display();
        System.out.println("\t\t\t\t" + getNumberOfPropertiesSold());
        System.out.println("\t\t\t Imóveis vendidos" );
    }
    
    /**
     * Shows the available listings
     * @param listing -> The reference to the position in memory of the object containing the property
     */
    public void displayListings(){
        if(!listing1.isSold()) listing1.display();
        if(!listing2.isSold()) listing2.display();
        if(listing3 != null){
            if(!listing3.isSold() && listing3 != null) listing3.display();
        }
    }
    
    /**
     * Method that adds a new student
     * 
     * @param listing -> The reference to the position in memory of the object containing the property
     */
    public void addListing(Listing listing){
        if(isAcceptingListings){
            this.listing3 = listing;
        }
    }
    
    /**
     * 
     * @param listing -> The reference to the position in memory of the object containing the property
     */
    public void markAsSold(Listing listing){
        if(listing != null){
            listing.changePurchaseStatus(true);
            this.totalReceivedInCommissions += listing.getPropertyPrice() * 0.02;
            this.numberOfPropertiesSold++;
        }
        double agencyComissions = listing.getPropertyPrice() * 0.03;
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
    
    public String getAgentName(){
        return agentName;
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
    
    public void setAgentName(String agentName){
        if(agentName != null){
            this.agentName = agentName;
        }
    }
    
    public boolean isSold(){
        return isSold;
    }
    
    public double getTotalReceivedInCommissions(){
        return totalReceivedInCommissions;
    }
    
    public int getNumberOfPropertiesSold(){
        return numberOfPropertiesSold;
    }
}