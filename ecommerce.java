/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
// hana
//2301180
package javaapplication1;
import java.util.Scanner;

/**
 *
 * @author hp
 */
public class ecommerce {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        electronicproducts e1=new electronicproducts();
        e1.setname("smartphone");
        e1.setproductid(1);
        e1.setprice(599.99f);
        e1.setbrand("sumsung");
        e1.setwarrantyperiod(1);
        clothingproducts c1=new clothingproducts();
        c1.setname("tshirt");
        c1.setfabric("cotton");
        c1.setsize("medium");
        c1.setproductid(2);
        c1.setprice(19.99f);
        bookproducts b1=new bookproducts();
        b1.setname("oop");
        b1.setproductid(3);
        b1.setprice(39.99f);
        b1.setauthor("oReilly");
        b1.setpublisher("x publications");
        System.out.println("welcome to the e commerce system");
        System.out.println("Enter your ID");
        int i=input.nextInt();
        System.out.println("enter your name");
        String n =input.next();
        System.out.println("enter your address");
        String add=input.next();
        customer m1=new customer();
        m1.setcustomerid(i);
        m1.setname(n);
        m1.setaddress(add);
        System.out.println("how many products you want to add to your cart");
        int x =input.nextInt();
        cart t1=new cart();
        t1.setnproducts(x);
        for(int z=1; z<=x;z++){
            System.out.println("which product would you like to add? 1-smartphone 2-TSHIRT 3-00P");
            int num=input.nextInt();
            switch(num){
                case 1:
                    t1.addproduct(e1);
                    break;
                case 2:
                    t1.addproduct(c1);
                    break;
                case 3:
                    t1.addproduct(b1);
                    break;
                    
            }
            
        }
        System.out.println("your total price is"+t1.calculatetotalprice());
        System.out.println("Wouid you like to place order? 1-yes 2- NO");
        int m=input.nextInt();
        switch(m){
            case 1:
         order o1=new order(m1.getcustomerid(),1,t1.calculatetotalprice(),t1.getnproducts(),t1.getprod());
         o1.printorderinfo();
         break;
            case 2:
                System.out.println("Thank you for using program");
         break;
        }
        
        
        
               
        
        
        
        
        
        
        // TODO code application logic here
    }
    
}
