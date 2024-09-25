package com.design.pattern.bridge.implementation;

public class VeggiePizza extends Pizza {

   @Override
   public void assemble() {
      System.out.println("Adding Sauce: " + sauce);
      System.out.println("Adding Toppings: " + toppings);
      System.out.println("Adding Cheese");
   }

   @Override
   public void qualityCheck() {
      System.out.println("Crust is: " + crust);
   }

   @Override
   public void setToppings(String everything) {
      super.toppings = everything;
   }

   @Override
   public void setSauce(String oil) {
        super.sauce = oil;
   }

   @Override
   public void setCrust(String thick) {
        super.crust = thick;
   }

}
