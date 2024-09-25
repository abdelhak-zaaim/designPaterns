package com.design.pattern.bridge.implementation;

public abstract class Pizza {
   protected String sauce;
   protected String toppings;
   protected  String crust;

   public abstract  void assemble();
   public abstract  void qualityCheck();

   public abstract void setToppings(String everything);

   public abstract void setSauce(String oil);

   public abstract void setCrust(String thick);
}
