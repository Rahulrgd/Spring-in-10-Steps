package com.in28minutes.learnspringin10steps.game;

import org.springframework.stereotype.Component;

public class SuperContraGame implements GamingConsole{

    public void up(){
        System.out.println("SuperContra look Up!");
    }

    public void down(){
        System.out.println("SuperContra look Down!");
    }

    public void left(){
        System.out.println("SuperContra look Left!");
    }

    public void right(){
        System.out.println("SuperContra look Right!");
    }
}
