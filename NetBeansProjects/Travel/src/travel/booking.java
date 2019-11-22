
package travel;

public class booking extends manager  {

private String bookingTitle;
private String date;

    
   public String getBookingTitle(){
      return  bookingTitle;
   }
   public String getDate(){
       return date;
   }
   
    public void setBookingTitle (String bti){
       this.bookingTitle=bti;
    }
   public void setDate(String d){
      this.date=d;
   }
  
 
}
