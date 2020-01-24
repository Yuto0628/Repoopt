package jp.ac.uryukyu.ie.e195732;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Random;

/**
 * 各クラスのメソッドがどう動くのかを確認するテスト用のクラス
 */
class PachimonTest {
    Party redTeam = new Party("レッド", new Pachimon[]{new Charizard()});
    Party greenTeam = new Party("グリーン", new Pachimon[]{new Venusaur()});
    GameMaster gameMaster = new GameMaster(redTeam, greenTeam);


    @Test
    void doTest(){
        gameMaster.battle(gameMaster.getFighter().get(0), gameMaster.getFighter().get(1));
    }
}

