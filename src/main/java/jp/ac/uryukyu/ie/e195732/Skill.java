package jp.ac.uryukyu.ie.e195732;

class Skill {
    private String name;
    private String type;
    private int power;
    private int accuracy;
    private int skillCount;
    private String skillType;
    private String direct = "direct";
    private String special = "special";
    private String change = "change";

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setAccuracy(int accuracy) {
        this.accuracy = accuracy;
    }

    public void setSkillCount(int skillCount) {
        this.skillCount = skillCount;
    }

    public void setSkillType(String skillType) {
        this.skillType = skillType;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getPower() {
        return power;
    }

    public int getAccuracy() {
        return accuracy;
    }

    public int getSkillCount() {
        return skillCount;
    }

    public String getSkillType() {
        return skillType;
    }

    public String getDirect() {
        return direct;
    }

    public String getSpecial() {
        return special;
    }

    public String getChange() {
        return change;
    }
}

class AquaTail extends Skill{
    AquaTail(){
        setName("アクアテール");
        setType("water");
        setPower(90);
        setAccuracy(90);
        setSkillCount(10);
        setSkillType(getDirect());
    }
}

class AirSlash extends Skill{
    AirSlash(){
        setName("エアスラッシュ");
        setType("fright");
        setPower(75);
        setAccuracy(95);
        setSkillCount(5);
        setSkillType(getSpecial());
    }
}

    class BodySlam extends Skill{
        BodySlam(){
            setName("のしかかり");
            setType("normal");
            setPower(85);
            setAccuracy(100);
            setSkillCount(15);
            setSkillType(getDirect());
        }
    }

class BrickBreak extends Skill{
    BrickBreak(){
        setName("瓦割り");
        setType("fighter");
        setPower(75);
        setAccuracy(100);
        setSkillCount(15);
        setSkillType(getDirect());
    }
}

class Crunch extends Skill{
    Crunch(){
        setName("噛み砕く");
        setType("evil");
        setPower(80);
        setAccuracy(100);
        setSkillCount(15);
        setSkillType(getDirect());
    }
}

class DragonPulse extends Skill{
    DragonPulse(){
        setName("竜の波動");
        setType("dragon");
        setPower(85);
        setAccuracy(100);
        setSkillCount(10);
        setSkillType(getSpecial());
    }
}

class Earthquake extends Skill{
    Earthquake(){
        setName("地震");
        setType("earth");
        setPower(100);
        setAccuracy(100);
        setSkillCount(10);
        setSkillType(getDirect());
    }
}

class Flamethrower extends Skill{
    Flamethrower(){
        setName("火炎放射");
        setType("fire");
        setPower(90);
        setAccuracy(100);
        setSkillCount(15);
        setSkillType(getSpecial());
    }
}

class FlareBlitz extends Skill{
    FlareBlitz(){
        setName("フレアドライブ");
        setType("fire");
        setPower(120);
        setAccuracy(100);
        setSkillCount(15);
        setSkillType(getDirect());
    }
}

class FocusBlast extends Skill{
    FocusBlast(){
        setName("気合い玉");
        setType("fighter");
        setPower(110);
        setAccuracy(70);
        setSkillCount(5);
        setSkillType(getSpecial());
    }
}

class LeafStorm extends Skill{
    LeafStorm(){
        setName("リーフストーム");
        setType("grass");
        setPower(130);
        setAccuracy(90);
        setSkillCount(5);
        setSkillType(getSpecial());
    }
}

class RockSlide extends Skill{
    RockSlide(){
        setName("岩雪崩");
        setType("rock");
        setPower(75);
        setAccuracy(90);
        setSkillCount(10);
        setSkillType(getDirect());
    }
}

class SludgeBomb extends Skill{
    SludgeBomb() {
        setName("ヘドロ爆弾");
        setType("poison");
        setPower(90);
        setAccuracy(100);
        setSkillCount(10);
        setSkillType(getSpecial());
    }
}

class Thunderbolt extends Skill{
    Thunderbolt(){
        setName("10万ボルト");
        setType("electricity");
        setPower(90);
        setAccuracy(100);
        setSkillCount(15);
        setSkillType(getSpecial());
    }
}

class WeatherBall extends Skill{
    WeatherBall(){
        setName("ウェザーボール");
        setType("normal");
        setPower(50);
        setAccuracy(100);
        setSkillCount(10);
        setSkillType(getSpecial());
    }
}

class WingAttack extends Skill{
    WingAttack(){
        setName("翼で打つ");
        setType("fright");
        setPower(60);
        setAccuracy(100);
        setSkillCount(35);
        setSkillType(getDirect());
    }
}