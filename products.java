/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author hp
 */
public class products {
    public int productid;
    public String name;
    public float price;
    public void setproductid(int ID){
        if(ID>0)
            productid=ID;
        else
            productid=Math.abs(ID);
        
    }
    public void setname(String n){
        name=n;
        
    }
    public void setprice(float p){
        if(p>0)
            price=p;
        else
            price=Math.abs(p);}
    public int getproductid(){
        return productid;}
    public String getname(){
        return name;
    }
    public float getprice(){
        return price;
    }
        
    
        
    
    
}
