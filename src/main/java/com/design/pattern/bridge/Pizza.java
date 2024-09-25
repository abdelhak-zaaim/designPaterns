package com.design.pattern.bridge;

public abstract class Pizza {
   protected String sauce;
   protected String toppings;
   protected  String crust;

   public abstract  void assemble();
   public abstract  void qualityCheck();
}
