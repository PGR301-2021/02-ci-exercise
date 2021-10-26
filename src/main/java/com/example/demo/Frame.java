package com.example.demo;

public class Frame {
    int kast = 0;
    int frame = 1;
    int maxFrame = 10;

    //kast ballen øker kast med 1. Når du har kastet ballen 2 ganger blir det en ny frame
    void kastBallen(){
        if(kast>1 && frame != maxFrame){
            frame++;
        }
        kast++;
    }

    public int getKast() {
        return kast;
    }

    public void setKast(int kast) {
        this.kast = kast;
    }

    public int getFrame() {
        return frame;
    }

    public void setFrame(int frame) {
        this.frame = frame;
    }
}
