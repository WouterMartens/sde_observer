package com.hz;

public class Gianni extends Student {

    public Gianni() {
        super("Gianni");
    }

    @Override
    public String getOpinion() {
        String message = "Oh no! %s is so boring...";
        return message;
    }
}
