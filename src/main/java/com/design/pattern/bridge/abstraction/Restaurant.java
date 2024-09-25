package com.design.pattern.bridge.abstraction;
import com.design.pattern.bridge.implementation.*;
public abstract class Restaurant {

   protected Pizza pizza;

   protected Restaurant(Pizza pizza) {
      this.pizza = pizza;
   }

   abstract void addSauce();
   abstract void addToppings();
   abstract void makeCrust();

   public void deliver() {
      makeCrust();
      addSauce();
      addToppings();
      pizza.assemble();
      pizza.qualityCheck();
      System.out.println("Order in Progress!");
   }

}
