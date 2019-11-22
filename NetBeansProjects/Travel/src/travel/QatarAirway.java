//homework 4 
package travel;
interface Flight{  
     // 3 methods
    
void departureTime();  
void arrivalTime ();
void seat();

}  
 
class Qatar implements Flight{  //one class implements interface

   
   
   @Override
public void departureTime() {
    String departureTime = "10:10pm";
System.out.println("departure time: "+ departureTime);

}  

@Override
public void arrivalTime (){
       String arrivalTime="8:00am";
    System.out.println("arrival time: "+arrivalTime);
}  
@Override
public void seat(){
       String seat="12f";
    System.out.println("number of seat: "+ seat);
}
}

 


