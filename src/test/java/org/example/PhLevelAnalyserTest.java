package org.example;

import org.junit.After;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class PhLevelAnalyserTest {
    PhLevelAnalyser obj;
    @BeforeEach
    public void assign(){
            obj=new PhLevelAnalyser();
    }
    @After
    public void release(){
        obj=null;
    }


    @org.junit.jupiter.api.Test
     void value() {

        assertEquals("For 0 it is acidic and for 14 alkaline", obj.value(14));

    }
    @org.junit.jupiter.api.Test
    void value2() {
        assertEquals("ph value for the goldfish survive", obj.value(7.5));
    }
    @org.junit.jupiter.api.Test
    void value3() {
        assertEquals("ph value is for natural water", obj.value(7));
    }
}