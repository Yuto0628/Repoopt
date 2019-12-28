package jp.ac.uryukyu.ie.e195732;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PachimonTest {

    @Test
    public void DoTest(){
        assertEquals(187, culcHp(80));
    }

    @Test
    public void DoTest2(){
        assertEquals(132, culcStatus(80));
    }

    int culcHp(int raceValue ) {
        return (int)Math.floor((raceValue *2 +31 +63)* 50 /100)+50 +10;
    }

    int culcStatus(int raceValue) {
        return (int)Math.floor((raceValue* 2+ 31+ 63)* 50 /100)+ 5;
    }

}