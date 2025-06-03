package com.example;

import org.apache.commons.lang3.StringUtils; // Used to simulate a dependency

public class SampleClass {

    // Intentionally formatted poorly to trigger Spotless and Checkstyle
    public String greet(String name){
        if(StringUtils.isBlank(name)){
            return "Hello, World!";
        } else {
            return "Hello, " + name;
        }
    }
}

