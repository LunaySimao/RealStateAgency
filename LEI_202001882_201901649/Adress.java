/**
 * Allows you to identify the location of the property
 * 
 * @docente (João Capinha)
 * @author (Lunay Simão, Egas Israel) 
 * @version (22/11/2021)
 */
public class Adress{
    private String street;
    private String city;
    private String postalCode;
    private int number;

    public Adress(String street, String city, int number, int firstCharacterSet, int secondCharacterSet){
        if(street != null){
            this.street = street;
        }
        
        if(city != null){
            this.city = city;
        }
        
        if(validadeNumber(number)){
            this.number = number;
        }
        
        if(validateCP(firstCharacterSet, secondCharacterSet)){
            this.postalCode = firstCharacterSet + "-" + secondCharacterSet;
        }
    }
    
    public Adress(String city){
        if(street != null){
            this.street = street;
        }
    }
    
    /**
     * Shows an adress
     */
    public void display(){
        System.out.println("Adress: \n");
        System.out.println(getStreet() + ", " + getNumber() + ", " + getPostalCode() + ", " + getCity());
    }
    
    public String getStreet(){
        return street;
    }
    
    public String getCity(){
        return city;
    }
    
    public int getNumber(){
        return number;
    }
    
    private String getPostalCode(){//É private por ser chamado no construtor
        return this.postalCode;
    }

    public void setStreet(String street) {
        if(street != null){
            this.street = street;
        }
    }

    public void setCity(String city) {
        if(city != null){
            this.city = city;
        } 
    }

    public void setPostalCode(int firstCharacterSet, int secondCharacterSet) {
        if(validateCP(firstCharacterSet, secondCharacterSet)){
            this.postalCode = firstCharacterSet + "-" + secondCharacterSet;
        }
    }

    public void setNumber(int number) {
        if(validadeNumber(number)){
            this. number = number;
        }
    }
    
    /**
     * Ensures that the received value is in the range
     * @param number -> the door/building number
     * @return 
     */
    private boolean validadeNumber(int number){
        return (number > 0 && number < 100) ? true: false; // Assumindo que o cliente somos nós, a regra de negócio é termos apenas portas no intervalo [1, 99]
    }
    
    /**
     * Validates a seven-digit zip code
     * @param firstCharacterSet
     * @param secondCharacterSet
     * @return 
     */
    private boolean validateCP(int firstCharacterSet, int secondCharacterSet){
        int length1 = String.valueOf(firstCharacterSet).length();
        int length2 = String.valueOf(secondCharacterSet).length();
        
        return (length1 == 4 && length2 == 3) && (firstCharacterSet > 0 && secondCharacterSet >= 0);
    }
}