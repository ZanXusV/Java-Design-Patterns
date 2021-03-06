package com.zanxus.javacodegeeks.patterns.flyweightpattern;

/**
 * @author root
 * @create 2016-12-14 9:14 PM
 */
public class CPPPlatform implements Platform {


    public CPPPlatform() {
        System.out.println("CPPPlatform object created");
    }

    @Override
    public void execute(Code code) {
        System.out.println("Compiling and executing C++ code");
    }
}
