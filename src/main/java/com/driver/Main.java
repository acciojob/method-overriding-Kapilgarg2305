package com.driver;

public class Main {
    public static void main(String args[]){
    A obj1=new B();
    B obj2=new B();
    System.out.println(A.meth());
        System.out.print(B.meth());
    }
  public static class A{
      public static String meth(){
          return "Invoking method from class A";

      }
  }
  public static class B extends A{
      public static String meth(){
          return "Method is overridden in Extended class B";

      }
  }
}