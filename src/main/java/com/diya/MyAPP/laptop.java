package com.diya.MyAPP;

import org.springframework.stereotype.Component;

@Component
public class laptop implements computer { // This is a class which implements the computer interface
    public void compile(){
        System.out.println("Compiling the code");
    } // This is a method to compile the code
}
