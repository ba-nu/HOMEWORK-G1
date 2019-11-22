
package travel;


public class manager {  
    private String name;
    private String birth;
    private int id;
    private long phoneNum;
    private String email;
    private String address;
    
     public String getName(){
       return name;
   }
    public String getBirth(){
       return  birth;
    }
   public int getId(){
      return  id;
   }
   public long getPhoneNum(){
       return phoneNum;
   }
    
   public String getEmail(){
      return  email;
   }
   public String getAddress(){
       return address;
   }
   public void setName(String n){
    
      this.name=n;
   }
    public void setBirth (String b ){
       this.birth=b;
    }
   public void setId(int i){
       
  this.id=i;
     
   }
   public void setPhoneNum(long phn){
      this.phoneNum=phn;
   }
    public void setEmail(String e){
       this.email=e;
   }
    public void setAddress (String a ){
      this.address=a;
}
    
}