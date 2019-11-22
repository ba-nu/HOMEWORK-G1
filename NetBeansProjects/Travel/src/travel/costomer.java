
package travel;

public class costomer extends manager { // Subclass (child)
    private String userName;
    private String password;
    
    public String getUserName(){
      return  userName;
   }
   public String getPassword(){
       return password;
   }
  
   public void setUserName(String un){
       this.userName=un;
   }
    public void setPassword (String p ){
       this.password=p;
    }
    
}
