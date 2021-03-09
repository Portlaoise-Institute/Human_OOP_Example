package com.mycompany.humanexample;


import java.util.*;

/**
 *      Adult subclass
 */
public class Adult extends Human {

    //Instance Variables
    private String ppsNo;
    private String occupation;
    private boolean isMarried;
    private boolean isCarOwner;
    
    
    //Adult Constructor 
    public  Adult(String name, int age, String gender, float height, float weight,
            String ppsNo, String occupation, boolean isMarried, boolean isCarOwner) {
        super(name, age, gender, height, weight);
        this.ppsNo = ppsNo;
        this.occupation = occupation;
        this.isCarOwner = isCarOwner;
        this.isMarried = isMarried;
    }

    /**
     * Methods
     */
    public String drive() {
        return "Driving a car safely...";
    }

    /**
     * 
     */
    public String procreate() {
        return "Procreating...";
    }
    
     /**
     * toString method in Adult subclass 
     * overrides toString method in Human superclass
     */
    @Override
    public String toString() {
        return super.toString() +
                "\nPPSNo: "+ppsNo +
                "\nOccupation: "+occupation+
                "\nMarriage Status: "+isMarried+
                "\nCar Owner: "+isCarOwner;
    }
    
    
    
    //Setter and Getter methods

    public String getPpsNo() {
        return ppsNo;
    }

    public void setPpsNo(String ppsNo) {
        this.ppsNo = ppsNo;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public boolean isIsMarried() {
        return isMarried;
    }

    public void setIsMarried(boolean isMarried) {
        this.isMarried = isMarried;
    }

    public boolean isIsCarOwner() {
        return isCarOwner;
    }

    public void setIsCarOwner(boolean isCarOwner) {
        this.isCarOwner = isCarOwner;
    }

    
}