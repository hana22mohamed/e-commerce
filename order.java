/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author hp
 */
public class order {
    public int customerid;
    public int orderid;
    public float totalprice;
    public products[]product;
    public int nproducts;
    public order(int customerid,int orderid,float totalprice,int nproducts,products[]product){
        this.customerid=customerid;
       this.orderid=orderid;
       this.totalprice=totalprice;
       
        this.nproducts=nproducts;
       this.product=product;
      
    }
    public void printorderinfo(){
        System.out.println("Here is your order summary");
        System.out.println("orderid"+orderid);
        System.out.println("customerid"+customerid);
        System.out.println("products:"); 
        for(int i=0;i<nproducts;i++){
      System.out.println("-" + product[i].getname() + ""+product[i].getprice());  
        }
    
    
     System.out.println("totalprice"+totalprice);
    }
    
    
}
    

