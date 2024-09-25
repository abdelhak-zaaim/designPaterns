package com.design.pattern.bridge.abstraction;

import com.design.pattern.bridge.implementation.Pizza;

public class ItalianRestaurant extends Restaurant {

   public ItalianRestaurant(Pizza pizza) {
      super(pizza);
   }

   @Override
   public void addToppings() {
      pizza.setToppings("-");
   }

   @Override
   public void addSauce() {
      pizza.setSauce("Oil");
   }

   @Override
   public void makeCrust() {
      pizza.setCrust("Thin");
   }

}
