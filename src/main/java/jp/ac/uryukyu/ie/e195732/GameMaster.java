package jp.ac.uryukyu.ie.e195732;

import java.util.ArrayList;
import java.util.Random;

public class GameMaster {
    ArrayList<Party> parties = new ArrayList<>(2);
    ArrayList<Pachimon> fighter =  new ArrayList<>(2);

    GameMaster(Party party1, Party party2) {

        parties.add(party1);
        parties.add(party2);

        fighter.add(parties.get(0).getMember()[0]);
        fighter.add(parties.get(1).getMember()[0]);
    }

    void playGame(){
        Random random = new Random();
        while (!(parties.get(0).isLose()) && !(parties.get(1).isLose())){
            int randomInt = random.nextInt(2);
            int randomSkill1 = random.nextInt(4);
            int randomSkill2 = random.nextInt(4);

            if (fighter.get(0).getSpeed() < fighter.get(1).getSpeed()) {
                battle(fighter.get(1), fighter.get(0), randomSkill1, randomSkill2);

            }
            else if (fighter.get(1).getSpeed() < fighter.get(0).getSpeed()){
                battle(fighter.get(0), fighter.get(1), randomSkill1, randomSkill2);

            }else if (randomInt ==  0){
                battle(fighter.get(1), fighter.get(0), randomSkill1, randomSkill2);
            }else {
                battle(fighter.get(0), fighter.get(1), randomSkill1, randomSkill2);}

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
    void battle(Pachimon pachimon1, Pachimon pachimon2, int num1, int num2){

        if (!pachimon1.isDead()) {
            pachimon1.execute(pachimon2, pachimon1.getSkills()[num1]);
            System.out.println(pachimon1.getName()+"の"+pachimon1.getSkills()[num1].getName()+"!");
            printCompatibility(pachimon1, pachimon2, num1);
            checkDead(pachimon2);
        }

        if (!pachimon2.isDead()){
            pachimon2.execute(pachimon1, pachimon2.getSkills()[num2]);
            System.out.println(pachimon2.getName()+"の"+pachimon2.getSkills()[num2].getName()+"!");
            printCompatibility(pachimon2, pachimon1, num2);
            checkDead(pachimon1);
        }
    }
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
    void checkDead(Pachimon pachimon){
        if (pachimon.getHp() <= 0) {
            pachimon.setHp(0);
            pachimon.setDead(true);
            System.out.println(pachimon.getName()+"は倒れた");
        }
    }
    void showHp(Pachimon pachimon){
        System.out.println(pachimon.getName()+":"+pachimon.getHp()+"/"+pachimon.getMaxHp());
    }

    public static void main(String[] args){
        Party redTeam1 = new Party("レッド", new Pachimon[]{new Charizard()});
        Party greenTeam1 = new Party("グリーン", new Pachimon[]{new Venusaur()});
        Party redTeam2 = new Party("レッド",  new Pachimon[]{new Aerodactyl()});
        Party greenTeam2 =  new Party("グリーン", new Pachimon[]{new Snorlax()});

        GameMaster  gameMaster1 =  new GameMaster(redTeam1, greenTeam1);
        gameMaster1.playGame();

        GameMaster gameMaster2 = new GameMaster(redTeam2, greenTeam2);
        gameMaster2.playGame();
    }
}
