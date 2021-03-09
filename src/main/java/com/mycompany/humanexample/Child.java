package com.mycompany.humanexample;

import java.util.*;

/**
 * Child Sub Class 
 */
public class Child extends Human {

    /**
     * instance variable
     */
    private String schoolCardNo;
 

    /**
     * Child Constructor
     */
    public Child(String name, int age, String gender, float height, 
            float weight, String schoolCardNo) {
        
        super(name, age, gender, height, weight);
        this.schoolCardNo = schoolCardNo;
    }

    /**
     * Swim method in Child subclass overrides
     * Swim method in Human Super class 
     */
    
    @Override
    public String swim() {
        
        if (this.getAge() > 5) {
            return super.swim();
        }
        else {
            return "As the child is 5 years old or younger, armbands must be "
                    + "\nworn and parental supervision is required. "+
                    super.swim();
        }
       
        
    } //end toString
    
    
    
    /**
     * toString method in Child subclass 
     * overrides toString method in Human superclass
     */
    @Override
    public String toString() {   
        
        return super.toString() +
                "\nSchoolCardNo: "+schoolCardNo;
    }
    
    //Setter and getter methods
    
    /**
     * @return
     */
    public String getSchoolCardNo() {
       
        return this.schoolCardNo;
    }

    /**
     * @param String schoolCardNo
     */
    public void setSchoolCardNo(String schoolCardNo) {
        this.schoolCardNo = schoolCardNo;
    }
    

}