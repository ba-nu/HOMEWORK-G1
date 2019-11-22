/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travel;
//Homework 3 

public class Aircraft { //inheritance and polymorphism and super 
    public int maxSpeed;
    public Aircraft(int maxSpeed ){
        this.maxSpeed =  maxSpeed;
    }
    public void print(){
        System.out.println("maximum speed is "+" "+ maxSpeed);
    }
}
    class Airplane extends Aircraft{

    public Airplane(int maxSpeed) {
        super(maxSpeed);
    }
   
    @Override
    public void print(){
        System.out.println("-------plane Details : ");
        super.print(); // calling super
        
    }   
    }
 class Airbus extends Aircraft{     
    public int size;
    public Airbus(int maxSpeed , int size){
        super(maxSpeed);
        this.size=size;
    }
    @Override
     public void print(){
        System.out.println("-------Airbus details : ");
        super.print();
         System.out.println(" Airbus size is"+" "+size);
}}

