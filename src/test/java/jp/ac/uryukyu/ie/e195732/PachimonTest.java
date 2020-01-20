package jp.ac.uryukyu.ie.e195732;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class PachimonTest {
    public class Party {
        private String trainnerName;
        private boolean lose = false;
        private int dyingCount = 0;
        private Pachimon[] pachimons;

        public void setTrainnerName(String trainnerName) { this.trainnerName = trainnerName; }

        public void setLose(boolean lose) { this.lose = lose; }

        public void setDyingCount(int dyingCount) { this.dyingCount = dyingCount; }

        public void setPachimons(Pachimon[] pachimons) { this.pachimons = pachimons; }

        public String getTrainnerName() { return trainnerName; }

        public boolean isLose() { return lose; }

        public int getDyingCount() { return dyingCount; }

        public Pachimon[] getPachimons() { return pachimons; }

        Party(String  trainnerName, Pachimon[] pachimons){
            this.setTrainnerName(trainnerName);
            for (int i=0; i<pachimons.length; i++){
                setPachimons(new Pachimon[i]);
            }
            setDyingCount(pachimons.length);
        }
    }
    @Test
    void doTest(){
        int n=0;
        for (int  i=0; i<5; i++){
            n++;
            System.out.println(n);
        }
    }
    @Test
    void doTest2(){
        Party party1 = new Party("taro", new Pachimon[]{new Charizard()});
        Party party2  = new Party("jiro", new Pachimon[]{new Venusaur(), new Blastoise()});
        assertEquals(1, party1.getDyingCount());
        assertEquals(2, party2.getDyingCount());
    }
}
