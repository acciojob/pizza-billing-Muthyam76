package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    int extrachessprice;
    int extratopprice;
    int extratakeaway;
    boolean extratake;
    boolean extrachess;
    boolean extratop;
    boolean billcheck;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg==true)
            price=300;
        else
            price=400;

        extrachess=false;
        extratop=false;
        extrachessprice=0;
        extratopprice=0;
        extratakeaway=0;
        extratake=false;
        billcheck=false;
        bill="Base Price Of The Pizza:"+price+"\n";


    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(extrachess==false) {
            //System.out.println("Extra Cheese Added:80");

            extrachessprice = 80;
            extrachess = true;
            price = price + extrachessprice;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(isVeg==true && extratop==false) {

            extratopprice=70;
            price=price+extratopprice;

        }
        else if(isVeg==false && extratop==false) {
            //System.out.println("Extra Toppings Added: 120");
            extratopprice = 120;
            price=price+extratopprice;
        }
           extratop=true;



    }

    public void addTakeaway(){
        // your code goes here
        if(extratake==false) {
           // System.out.println("Paperbag Added: 20");
            extratake=true;
            extratakeaway=20;
            price=price+extratakeaway;
        }

    }

    public String getBill(){
        // your code goes here
        if(billcheck==false) {
            billcheck=true;
            if (extrachess == true)
                bill = bill + "Extra Cheese Added:" + extrachessprice + "\n";
            if (extratop == true)
                bill = bill + "Extra Toppings Added:" + extratopprice + "\n";
            if (extratake == true)
                bill = bill + "Paperbag Added:" + extratakeaway + "\n";
            bill = bill + "Total Price:" + price + "\n";
            return this.bill;

        }

        return "";
    }
}
