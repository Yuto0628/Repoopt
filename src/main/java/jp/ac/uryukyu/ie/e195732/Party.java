package jp.ac.uryukyu.ie.e195732;

public class Party {
    private String trainerName;
    private boolean lose = false;
    private int dyingCount = 0;
    private Pachimon[] pachimons;

    public void setTrainnerName(String trainnerName) { this.trainerName = trainnerName; }

    public void setLose(boolean lose) { this.lose = lose; }

    public void setDyingCount(int dyingCount) { this.dyingCount = dyingCount; }

    public void setPachimons(Pachimon[] pachimons) { this.pachimons = pachimons; }

    public String getTrainnerName() { return trainerName; }

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
