package com.diya.MyAPP;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component

public class Dev {
    //FIELD INJECTION
@Autowired // This is used to inject the object of the laptop class 

 @Qualifier("laptop")   // This is used to specify the name of the class
private computer comp; // This is an object of the laptop class
// // CONSTUCTOR INJECTION
    // public Dev(laptop laptop) {
    //     this.laptop = laptop; 
    // }
    //     //SETTER INJECTION
    //     @Autowired
    //     public void setLaptop(laptop laptop){
    //         this.laptop = laptop;
    //     }

    public void build(){
        comp.compile(); // This is a method to compile the code

        System.out.println("Building the project");
    } // This is a method to build the project
}

// 3types of injection
// 1. field injection
// 2. constructor injection
// 3. setter injection

// Field injection is not recommended because it is not a good practice to use field injection. It is recommended to use constructor injection or setter injection.

// we need to use autowired for field injection and setter injection
//for constructor injection we don't need to use autowired