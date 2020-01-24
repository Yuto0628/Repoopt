package jp.ac.uryukyu.ie.e195732;

public class Main {
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
