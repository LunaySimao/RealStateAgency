
/**
 * Escreva a descrição da classe AppStart aqui.
 * 
 * @docente (João Capinha)
 * @author (Lunay Simão, Egas Israel) 
 * @version (22/11/2021)
 */
public class AppStart{
    
    public AppStart(){
        
    }
    
    public static void main(String[] args){        
        Adress adress1 = new Adress("Rua Miguel Bombarda", "SetÃºbal", 11, 2834, 105);
        Adress adress2 = new Adress("PraÃ§a MarquÃªs de Pombal", "Lisboa", 3, 1250, 160);
        Adress adress3 = new Adress("Praceta 25 de Abril", "Porto", 59, 4430, 257);
        Adress adress4 = new Adress("Largo da Paz", "Lisboa", 33, 1300, 450);
        Adress adress5 = new Adress("EstaÃ§Ã£o de faro", "Faro",33, 4192, 321);//2.1.3 com base no preÃ§o, nos detalhes do imÃ³vel e a cidade e na indicaÃ§Ã£o de presenÃ§a de um quintal.
        
        HouseData houseData1 = new HouseData(10, 7, false, adress5);//2.1.3 com base no preÃ§o, na morada, no cÃ³digo postal, na cidade e na Ã¡rea ;
        HouseData houseData2 = new HouseData(10, 5, false, adress1);
        HouseData houseData3 = new HouseData(10,9,true, adress2);
        
        Listing listing1 = new Listing(50000.0,adress1, houseData1); //2.1.3 Com base no preÃ§o, na morada, no cÃ³digo postal, na cidade e na Ã¡rea;      
        Listing listing2 = new Listing(40000.0,adress2, houseData2);
        Listing listing3 = new Listing(120000.0,adress5, houseData3);//2.1.3 com base no preÃ§o, nos detalhes do imÃ³vel e a cidade e na indicaÃ§Ã£o de presenÃ§a de um quintal.
        
        Agent agent1 = new Agent("Marcio de Carvalho", listing1, listing2);
        Agent agent2 = new Agent("LÃºÃ­s Semedo", listing1, listing3);
        
        Listings listings1 = new Listings(listing1, listing2, listing3);
        
        
        RealStateAgency realStateAgency = new RealStateAgency(listing1, listing2,listings1, agent1, agent2);      
        Listing listing4 = new Listing(50000, adress4, houseData1);
    }
}
