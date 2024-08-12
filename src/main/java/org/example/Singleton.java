package org.example;

public class Singleton implements Cloneable{
    public static Singleton instance;
    Singleton(){
      if(instance!=null){
        throw new RuntimeException("Not Allwoed to create using constructor use getInstance methodr");
      }
    }
    public static synchronized Singleton getInstanse(){
        if(instance==null){
            instance= new Singleton();
        }
        return instance;
    }
    
    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Cloning of this class is not allowed.");
    }

}
