package jp.ac.uryukyu.ie.e195732;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Random;


class PachimonTest {
    Party redTeam = new Party("レッド", new Pachimon[]{new Charizard()});
    Party greenTeam = new Party("グリーン", new Pachimon[]{new Venusaur()});
    GameMaster gameMaster = new GameMaster(redTeam, greenTeam);


    @Test
    void doTest(){
        redTeam.getMember()[0].setHp(0);
        gameMaster.pachimonHpCheck(redTeam);
        Pachimon[] pachimons = new Pachimon[2];
        pachimons[0] = new Charizard();
        pachimons[1] = new Venusaur();
        gameMaster.showHp(pachimons[0]);
        gameMaster.showHp(pachimons[1]);
    }
}

