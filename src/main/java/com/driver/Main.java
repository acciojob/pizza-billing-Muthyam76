package com.driver;

public class Main {
  public static void main(String[] args) {
    DeluxePizza dp = new DeluxePizza(false);
    System.out.println(dp.getPrice());
   // dp.addTakeaway();
   // dp.addExtraCheese();
    //dp.addTakeaway();
    System.out.println(dp.getBill());

    Pizza p = new Pizza(false);
    p.addExtraCheese();
    p.addExtraToppings();
    p.addTakeaway();
    p.addTakeaway();
    p.addExtraToppings();
    p.addExtraToppings();
    p.addExtraCheese();
    System.out.println(p.getBill());
    System.out.println(p.getBill());
  }
}