/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author hp
 */
public class cart {
    private int customerid;
    private int nproducts;
    private products[]product;
    
    public void setcustomerid(int ID){
        if(ID>0)
            customerid=ID;
        else{
            customerid=Math.abs(ID);}
    }
    public void setnproducts(int n){
        if(n>0)
            nproducts=n;
                    else
            nproducts=Math.abs(n);
product=new products[nproducts];}
        
    public int getcustomerid(){
        return customerid;}
    public int getnproducts(){
        return nproducts;}
 
        
    
    public void addproduct(products prod){
        for(int i=0;i<nproducts;i++){
            if(product[i]==null){
                product[i]=prod;
                break;
            }
        }
    }
    public void removeproduct(products prod){
        for(int i=0; i<nproducts;i++){
            if(product[i]==prod){
                product[i]=null;
                
                
                break;
            }
        }
    }
       public products[] getprod(){
return product;
    }
public float calculatetotalprice(){
    float totalprice=0;
    for(int i=0;i<nproducts;i++){
        totalprice+=product[i].getprice();
}
    return totalprice;
}

        
    
    
        
    
    
        
    
    
    
        
    
    
}
    
           
        
        
        
        
    
    


    



 

        
