package com.mycompany.humanexample;

/**
 * Creating Adult, Child and Baby Objects from class templates
 * and testing override methods
 */
public class Main {

    
    public static void main(String[] args) {
        
        
        //Create an Adult object and call toString, eat and drive methods
       
        Adult billy = new Adult("Billy White", 30, "Male", 6.5f, 11.0f, "5645614F",
                                    "Software Developer",true, true);
        
        System.out.println(billy.toString());
        System.out.println(billy.eat());               
        System.out.println(billy.drive());
        
                
        
        //Create a child object and call toString, eat and swim methods
       
        Child frank = new Child("Frank Davis", 3, "Male", 1.5f, 3.0f, "N/A");
        
        System.out.println(frank.toString());
        System.out.println(frank.eat());               
        System.out.println(frank.swim());
        
        
        //Create a baby object (1 year old) and call toString, sleep and swim methods
       
        Baby gillian = new Baby("Gillian Taylor", 1, "Female", 0.6f, 1.0f, true);
        
        System.out.println(gillian.toString());
        System.out.println(gillian.sleep());
        System.out.println(gillian.swim());
        
        
        
    } //end main
    
} //end class
