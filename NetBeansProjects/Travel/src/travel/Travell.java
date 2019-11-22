
package travel;

public class Travell {
   private String fullName;
   private String passportId;
   private String travelPlace;
   private int ticketCost;
   
   
   public String getFullName(){
       return fullName;
   }
    public String getPassportId(){
       return  passportId;
    }
   public String getTravelPlace(){
      return  travelPlace;
   }
   public int getTicketCost(){
       return ticketCost;
   }
   public void setFullName(String fn){
       fullName=fn;
   }
    public void setPassportId(String pId ){
       passportId=pId;
    }
   public void setTravelPlace(String tpl){
      travelPlace=tpl;
   }
   public void setTicketCost(int tic){
      ticketCost=tic;
   }
   
 
}
