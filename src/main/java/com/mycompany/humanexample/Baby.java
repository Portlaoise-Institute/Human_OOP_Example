package com.mycompany.humanexample;


import java.util.*;

/**
 * Baby Subclass
 */
public class Baby extends Human {

     /**
     * instance variables
     */
    private boolean isTeething;

    /**
     * Baby Constructor
     */
    public Baby(String name, int age, String gender, float height, float weight,boolean isTeething) {
        super(name, age, gender, height, weight);
        this.isTeething = isTeething;
    }

    /**
     * Sleep method in Baby subclass overrides 
     * Sleep method in Human Superclass
     */
    @Override
    public String sleep() {
        if (isTeething){
            return "Baby not sleeping!";
        }
        else
        {
            return super.sleep();
        }
        
    }

    /**
     * Swim method in Baby subclass overrides
     * Swim method in Human Super class 
     */
    @Override
    public String swim() {
        return "A baby cannot swim safely";
    }

    
    //Setter and getter methods
    
    public boolean isIsTeething() {
        return isTeething;
    }

    public void setIsTeething(boolean isTeething) {
        this.isTeething = isTeething;
    }

}