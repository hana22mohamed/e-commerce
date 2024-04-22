/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author hp
 */
public class customer  {
    private int customerid;
    private String name;
    private String address;
    public void setcustomerid(int ID){
        if(ID>0)
            customerid=ID;
        else
            customerid=Math.abs(ID);}
    public void setaddress(String add){
        address=add;
    }
    public void setname(String n){
        name=n;}
    public String getname(){
        return name;}
    public String getaddress(){
        return address;}
    public int getcustomerid(){
        return customerid;
    }
    
    
            
    

    
}
