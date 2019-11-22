
package travel;




public class Travel {

   
   


    public static void main(String[] args) {
       
       Travell obj =new Travell();
        obj.setFullName("Dyana");
        obj.setPassportId("A721");
        obj.setTravelPlace("Dubai UAE");
        obj.setTicketCost(760000);
        
         
        System.out.println("Full Name: "+obj.getFullName());
        System.out.println("Passport ID: "+obj.getPassportId());
        System.out.println("Travel Place: "+obj.getTravelPlace());
        System.out.println("Ticket Cost: "+obj.getTicketCost()); 
        
        
        
        
        manager obj2=new manager();
        obj2.setName("sivan");
        obj2.setBirth("27Oct 1999");
        obj2.setId(12233);
        obj2.setPhoneNum(07701010101);
        obj2.setEmail("sivank@gmail.com");
        obj2.setAddress("Sulaimane , uhd uni , qrga");
        
        System.out.println("name:  "+obj2.getName());
        System.out.println("birth:  "+obj2.getBirth());
        System.out.println("ID:  "+obj2.getId());
        System.out.println("phone number:  "+obj2.getPhoneNum());
        System.out.println("email:  "+obj2.getEmail());
        System.out.println("address:  "+obj2.getAddress());
        
        costomer obj3=new costomer();
        
        obj3.setUserName("sana-fuad");
        obj3.setPassword("s1245");
        
        
        System.out.println("username:  "+obj3.getUserName());
        System.out.println("password:  "+obj3.getPassword());
        
        
        cabs obj4=new cabs();
        
        obj4.setType("car");
        
         
        System.out.println("cabs type:  "+obj4.getType());
        
        
        
        
        booking obj5=new booking();
        
        obj5.setBookingTitle("Ms");
        obj5.setDate("22oct 2019");
        
         
        System.out.println("booking title:  "+obj5.getBookingTitle());
        System.out.println("booking date:  "+obj5.getDate());
        
        
        
        
        payment obj6=new payment();
      
        obj6.setAmount(900.500);
        obj6.setDatePayment("13Oct 2019");
        
        System.out.println("payed amount:  "+obj6.getAmount());
        System.out.println("date of payment:  "+obj6.getDatePaymentt());
    }
  
}
