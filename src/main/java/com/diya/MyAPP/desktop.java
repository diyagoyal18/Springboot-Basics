package com.diya.MyAPP;

// import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
// @Primary // This is used to make the desktop class as the primary class // and this will be used when we have multiple classes implementing the same interface
// // @Qualifier("desktop") // This is used to specify the name of the class

public class desktop implements computer { // This is a class which implements the computer interface
    public void compile(){
        System.out.println("Compiling the code in desktop");
    } // This is a method to compile the code
    
}
