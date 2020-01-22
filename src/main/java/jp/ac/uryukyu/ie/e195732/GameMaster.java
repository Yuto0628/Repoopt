package jp.ac.uryukyu.ie.e195732;

import java.util.ArrayList;
import java.util.Random;

public class GameMaster {
    private Party party1;
    private Party party2;
    ArrayList<Pachimon> fighter =  new ArrayList<>(2);

    GameMaster(Party party1, Party party2) {
        this.party1 = party1;
        this.party2 = party2;
        fighter.add(party1.getMember()[0]);
        fighter.add(party2.getMember()[0]);
    }

    void playGame(){
        Random random = new Random();
        while (!(party1.isLose()) && !(party2.isLose())){
            int randomInt = random.nextInt(2);
            int randomSkill1 = random.nextInt(4);
            int randomSkill2 = random.nextInt(4);

            if (fighter.get(1).getSpeed() < fighter.get(0).getSpeed()) {
                battle(party1, party2, randomSkill1, randomSkill2);

            }
            else if (fighter.get(0).getSpeed()< fighter.get(1).getSpeed()){
                battle(party2, party1, randomSkill2, randomSkill1);

            }else if (randomInt ==  0){
                battle(party1, party2, randomSkill1, randomSkill2);

            }else { battle(party2, party1, randomSkill2, randomSkill1); }

            showHp(party1.getMember()[0]);
            showHp(party2.getMember()[0]);
        }
    }
    void battle(Party party1, Party party2, int num1, int num2){

        if (!party1.getMember()[0].isDead()) {
            party1.getMember()[0].execute(party2.getMember()[0], party1.getMember()[0].getSkills()[num1]);
            System.out.println(party1.getMember()[0].getName()+"の"+party1.getMember()[0].getSkills()[num1].getName()+"!");
            pachimonHpCheck(party2); }

        if (!party2.getMember()[0].isDead()){
            party2.getMember()[0].execute(party1.getMember()[0], party2.getMember()[0].getSkills()[num2]);
            System.out.println(party2.getMember()[0].getName()+"の"+party2.getMember()[0].getSkills()[num2].getName()+"!");
            pachimonHpCheck(party1);
        }
    }
    void duel(Pachimon pachimon1, Pachimon  pachimon2, int num1, int num2){

        if (!pachimon1.isDead()) {
            pachimon1.execute(pachimon2, pachimon1.getSkills()[num1]);
            System.out.println(pachimon1.getName()+"の"+pachimon1.getSkills()[num1].getName()+"!");
            pachimonHpCheck(party2); }

        if (!party2.getMember()[0].isDead()){
            pachimon2.execute(pachimon1, pachimon2.getSkills()[num2]);
            System.out.println(pachimon2.getName()+"の"+pachimon2.getSkills()[num2].getName()+"!");
            pachimonHpCheck(party1);
        }
    }

    void pachimonHpCheck(Party party){
        if (party.getMember()[0].getHp() <= 0) {
            party.getMember()[0].setHp(0);
            party.getMember()[0].setDead(true);
            party.setDyingCount(party.getDyingCount() - 1);
            System.out.println(party.getMember()[0].getName()+"は倒れた");
            if (party.getDyingCount() == 0){
                party.setLose(true);
                System.out.println(party.getTrainnerName()+"は目の前が真っ暗になった");
            }
        }
    }
    void showHp(Pachimon pachimon){
        System.out.println(pachimon.getHp()+"/"+pachimon.getMaxHp());
    }

    public void setFighter(ArrayList<Pachimon> fighter) { this.fighter = fighter; }

    public ArrayList<Pachimon> getFighter() { return fighter; }

    public static void main(String[] args){
        Party redTeam = new Party("レッド", new Pachimon[]{new Charizard()});
        Party greenTeam = new Party("グリーン", new Pachimon[]{new Venusaur()});
        GameMaster  gameMaster =  new GameMaster(redTeam, greenTeam);
        gameMaster.playGame();
    }
}
