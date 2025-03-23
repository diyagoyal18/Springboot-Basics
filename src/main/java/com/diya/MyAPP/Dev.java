package com.diya.MyAPP;

import org.springframework.stereotype.Component;

@Component
public class Dev {

    laptop laptop; // This is an object of the laptop class
    public void build(){
        laptop.compile(); // This is a method to compile the code

        System.out.println("Building the project");
    } // This is a method to build the project
}
