/**
 * A real state property transacted by the agency and sold bay a seller
 * 
 * @docente (João Capinha)
 * @author (Lunay Simão, Egas Israel) 
 * @version (22/11/2021)
 */
public class Listing{
    private double propertyPrice;
    private static int propertyNumber;
    private boolean isSold;
    private Adress adress;
    private HouseData houseData;
    
    //1.
    public Listing(double propertyPrice, Adress adress, HouseData houseData){
        isSold = false;
        this.propertyNumber = 0;
        if(houseData != null){
            this.houseData = houseData;
        }
        
        if(propertyPrice > 0){
            this.propertyPrice = propertyPrice;
        }
        
        if(adress != null){
            this.adress = adress;
        }
    }
    
    /**
     * This method checks to see if it is located in a particular city
     * @param listing The property to check if there is in the city we are looking for
     * @param city The city used as a search criterion
     * @return 
     */
    public boolean isLocatedAt(Listing listing, String city){
        return listing.adress.getCity().equalsIgnoreCase(city)? true : false;
    }
    
    /**
     * The informtaion of a listing
     */
    public void display(){
        System.out.println("\t # " + getPropertyNumber() + "\t\t\t" + "Preço \t" + getPropertyPrice() + "€");
        System.out.println();
        getAdress();
        System.out.println(getHouseData().getSurface() + " m2");
        System.out.println("Vendido: " + isSold());
    }
    
    public void changePurchaseStatus(boolean setSold){
        this.isSold = setSold;
    }
    
    public boolean isSold(){
        return isSold;
    }
    
    public int getPropertyNumber(){
        return propertyNumber;
    }
    
    public double getPropertyPrice(){
        return propertyPrice;
    }
    
    public Adress getAdress(){
        return adress;
    }
    
    public HouseData getHouseData(){
        return houseData;
    }
}