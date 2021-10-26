package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestFrame {
    @Test
    void UltimateEasyFrameTest(){
        Frame frame = new Frame();
        frame.kastBallen();
        assertTrue(frame.getKast()==1);
    }

    @Test
    void Kast_ballen_mange_ganger(){
        Frame frame = new Frame();
        frame.kastBallen();
        frame.kastBallen();
        frame.kastBallen();
        frame.kastBallen();
        frame.kastBallen();
        frame.kastBallen();
        frame.kastBallen();
        assertTrue(frame.getFrame()!=1);
    }
}
