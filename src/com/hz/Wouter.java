package com.hz;

public class Wouter extends Student {

    public Wouter() {
        super("Wouter");
    }

    @Override
    public String getOpinion() {
        String message = "Oh yes! %s is so fun!";
        return message;
    }
}
