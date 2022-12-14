package com.driver;

public class Pizza {
    private int price;
    private Boolean isVeg;
    private String bill;
    private int cheesePrice;
    private int topingsPrice;
    private int bagPrice;
    private boolean  isCheeseAdded=false;
    private boolean isTopingsAdded=false;
    private boolean isBillGenerated=false;
    private boolean isBagAdded=false;





    public Pizza(Boolean isVeg){
        cheesePrice=80;
        bagPrice=20;
        if(isVeg==true){
            price=300;
            topingsPrice=70;
        }
        else{
            price=400;
            topingsPrice=120;
        }
        bill="Base Price Of The Pizza: "+price+"\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(isCheeseAdded==false){
            price=price+cheesePrice;
            isCheeseAdded=true;
        }

    }

    public void addExtraToppings(){
        // your code goes here
        if(isTopingsAdded==false){
            price=price+topingsPrice;
            isTopingsAdded=true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(isBagAdded==false){
            price=price+bagPrice;
            isBagAdded=true;
        }
    }

    public String getBill(){
        // your code goes here
        if(isBillGenerated==false){

            if(isCheeseAdded==true){
                bill=bill+"Extra Cheese Added: "+cheesePrice+"\n";
            }
            if(isTopingsAdded==true){
                bill=bill+"Extra Toppings Added: "+topingsPrice+"\n";
            }
            if(isBagAdded==true){
                bill=bill+"Paperbag Added: "+bagPrice+"\n";
            }

            bill=bill+"Total Price: "+price+"\n";
            isBillGenerated=true;
            return bill;
        }
        return  "";
    }
}
