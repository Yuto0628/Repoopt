package jp.ac.uryukyu.ie.e195732;

import java.util.ArrayList;
import java.util.Random;

/**
 * ゲームを進行するクラス。コンストラクタの引数にバトルをするパーティをとる。
 */
public class GameMaster {
    private ArrayList<Party> parties = new ArrayList<>(2);
    private ArrayList<Pachimon> fighter =  new ArrayList<>(2);

    GameMaster(Party party1, Party party2) {

        parties.add(party1);
        parties.add(party2);

        fighter.add(parties.get(0).getMember()[0]);
        fighter.add(parties.get(1).getMember()[0]);
    }

    /**
     *　実際にバトルを始める処理。どちらかのパーティが負けるまでバトルを続ける。
     */
    void playGame(){
        Random random = new Random();
        System.out.println("バトル開始!!");
        System.out.println("");
        while (!(parties.get(0).isLose()) && !(parties.get(1).isLose())){
            int randomInt = random.nextInt(2);

            if (fighter.get(0).getSpeed() < fighter.get(1).getSpeed()) {
                battle(fighter.get(1), fighter.get(0));
            } else if (fighter.get(1).getSpeed() < fighter.get(0).getSpeed()){
                battle(fighter.get(0), fighter.get(1));
            }else if (randomInt ==  0){
                battle(fighter.get(1), fighter.get(0));
            }else {
                battle(fighter.get(0), fighter.get(1));
            }

            System.out.println("");
            showHp(fighter.get(0));
            showHp(fighter.get(1));
            System.out.println("");

            if(fighter.get(0).isDead()){
                parties.get(0).setDyingCount(parties.get(0).getDyingCount()-1);
                if(parties.get(0).getDyingCount()==0){
                    parties.get(0).setLose(true);
                    System.out.println(parties.get(0).getTrainnerName()+"は目の前が真っ暗になった...");
                    System.out.println("");
                }
            }
            if(fighter.get(1).isDead()){
                parties.get(1).setDyingCount(parties.get(1).getDyingCount()-1);
                if(parties.get(1).getDyingCount()==0){
                    parties.get(1).setLose(true);
                    System.out.println(parties.get(1).getTrainnerName()+"は目の前が真っ暗になった...");
                    System.out.println("");
                }
            }
        }
    }

    /**
     *パチモン同士を戦わせる処理。パチモンがどの技を使うかはランダムになっている。
     * @param pachimon1　戦うパチモンその1のインスタンス
     * @param pachimon2　戦うパチモンその2のインスタンス
     */
    void battle(Pachimon pachimon1, Pachimon pachimon2){

        Random random = new Random();
        int randomSkill1 = random.nextInt(4);
        int randomSkill2 = random.nextInt(4);

        if (!pachimon1.isDead()) {
            pachimon1.execute(pachimon2, pachimon1.getSkills()[randomSkill1]);
            System.out.println(pachimon1.getName()+"の"+pachimon1.getSkills()[randomSkill1].getName()+"!");
            printCompatibility(pachimon1, pachimon2, randomSkill1);
            checkDead(pachimon2);
        }
        if (!pachimon2.isDead()){
            pachimon2.execute(pachimon1, pachimon2.getSkills()[randomSkill2]);
            System.out.println(pachimon2.getName()+"の"+pachimon2.getSkills()[randomSkill2].getName()+"!");
            printCompatibility(pachimon2, pachimon1, randomSkill2);
            checkDead(pachimon1);
        }
    }

    /**
     * タイプ相性を元に、攻撃が対象に有効だったかどうかを表示する
     * @param executer　攻撃するパチモンのインスタンス
     * @param target　攻撃されるパチモンのインスタンス
     * @param num　攻撃するパチモンの技の番号
     */
    void printCompatibility(Pachimon executer, Pachimon target,  int num){
        double compatibility = executer.checkCompatibility(target, executer.getSkills()[num]);
        if(compatibility == 0){
            System.out.println("しかし効果はないようだ...");
        }
        else if(compatibility < 1){
            System.out.println("しかし効果はいまひとつのようだ...");
        }
        if(compatibility >= 2){
            System.out.println("効果は抜群だ！");
        }
    }

    /**
     * パチモンが瀕死状態かをチェックする
     * @param pachimon　状態を確認するパチモンのインスタンス
     */
    void checkDead(Pachimon pachimon){
        if (pachimon.getHp() <= 0) {
            pachimon.setHp(0);
            pachimon.setDead(true);
            System.out.println(pachimon.getName()+"は倒れた");
        }
    }

    /**
     * パチモンの現在のHPを表示する
     * @param pachimon　HPを表示するパチモンのインスタンス
     */
    void showHp(Pachimon pachimon){
        System.out.println(pachimon.getName()+":"+pachimon.getHp()+"/"+pachimon.getMaxHp());
    }

    public ArrayList<Pachimon> getFighter() { return fighter; }
    public ArrayList<Party> getParties() { return parties; }
}
