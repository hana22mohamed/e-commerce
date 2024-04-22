/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author hp
 */
public class electronicproducts extends products {
    private String brand;
    private int warrantyperiod;
    public void setbrand(String b){
        brand=b;
    }
    public void setwarrantyperiod(int w){
        if(w>0)
            warrantyperiod=w;
        else
            warrantyperiod=Math.abs(w);
    }
    public String getbrand(){
        return brand;
    }
    public int getwarrantyperiod(){
        return warrantyperiod;
    }
}
