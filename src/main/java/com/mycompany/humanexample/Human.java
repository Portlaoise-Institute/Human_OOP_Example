package com.mycompany.humanexample;

import java.util.*;

/**
 * Human Super Class
 */
public class Human {

    //Instance Variables 
   
    private String name;
    private int age;
    private String gender;
    private float height;
    private float weight;

    /**
     * Full constructor
     */
    public Human(String name, int age, String gender, float height, float weight) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
        
    }

    //Methods

    /**
     * 
     */
    public String sleep() {
        return "Sleeping soundly....";
    }

    /**
     * 
     */
    public String eat() {
        return "Eating slowly & chewing carefully....";
    }

    /**
     * 
     */
    public String swim() {
       return "Arms rotating and pushing the body forwards..";
    }

    /**
     *   toString method
     */
    public String toString() {
        return "\nName: " + name +
               "\nAge: " +age +
                "\nGender: "+ gender+
                "\nHeight: "+height+
                "\nWeight: "+weight;
    }

    //Setter and getter methods
    
    /**
     * @return
     */
    public int getAge() {
        // TODO implement here
        return age;
    }

    /**
     * @param int age
     */
    public void setAge(int age) {
        this.age = age;
    }

    
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

}