package jp.ac.uryukyu.ie.e195732;

/**
 * パチモンをまとめるクラス。バトルをするときはパーティにいるパチモンたちが戦う
 */
public class Party {
    private String trainerName;
    private boolean lose = false;
    private int dyingCount = 0;
    private Pachimon[] member;

    Party(String  trainerName, Pachimon[] member){
        this.member = member;
        this.setTrainnerName(trainerName);
        setDyingCount(member.length);
    }

    public void setTrainnerName(String trainerName) { this.trainerName = trainerName; }

    public void setLose(boolean lose) { this.lose = lose; }

    public void setDyingCount(int dyingCount) { this.dyingCount = dyingCount; }

    public String getTrainnerName() { return trainerName; }

    public boolean isLose() { return lose; }

    public int getDyingCount() { return dyingCount; }

    public Pachimon[] getMember() { return member; }
}
