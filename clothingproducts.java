/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author hp
 */
public class clothingproducts extends products {
    private String size;
    private String fabric;
    public void setsize(String s){
        size=s;
    }
    public void setfabric(String f){
        fabric=f;
    }
    public String getfabric(){
        return fabric;
    }
    public String getsize(){
        return size;
    }
    
}
