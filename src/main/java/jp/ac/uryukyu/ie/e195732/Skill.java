package jp.ac.uryukyu.ie.e195732;

class Skill {
    private String name;
    private String type;
    private int power;
    private String skillType;
    private String direct = "direct";
    private String special = "special";

    public void setName(String name) { this.name = name; }
    public void setType(String type) { this.type = type; }
    public void setPower(int power) { this.power = power; }
    public void setSkillType(String skillType) { this.skillType = skillType; }

    public String getName() { return name; }
    public String getType() { return type; }
    public int getPower() { return power; }
    public String getSkillType() { return skillType; }
    public String getDirect() { return direct; }
    public String getSpecial() { return special; }
}

class AquaTail extends Skill{
    private Water water = new Water();
    AquaTail(){
        setName("アクアテール");
        setType(water.getName());
        setPower(90);
        setSkillType(getDirect());
    }
}

class AirSlash extends Skill{
    private Fright fright = new Fright();
    AirSlash(){
        setName("エアスラッシュ");
        setType(fright.getName());
        setPower(75);
        setSkillType(getSpecial());
    }
}

    class BodySlam extends Skill{
    private Normal normal = new Normal();
        BodySlam(){
            setName("のしかかり");
            setType(normal.getName());
            setPower(85);
            setSkillType(getDirect());
        }
    }

class BrickBreak extends Skill{
    Fighter fighter = new Fighter();
    BrickBreak(){
        setName("瓦割り");
        setType(fighter.getName());
        setPower(75);
        setSkillType(getDirect());
    }
}

class Crunch extends Skill{
    Evil evil = new Evil();
    Crunch(){
        setName("噛み砕く");
        setType(evil.getName());
        setPower(80);
        setSkillType(getDirect());
    }
}

class DragonPulse extends Skill{
    Dragon dragon = new Dragon();
    DragonPulse(){
        setName("竜の波動");
        setType(dragon.getName());
        setPower(85);
        setSkillType(getSpecial());
    }
}

class Earthquake extends Skill{
    Earth earth = new Earth();
    Earthquake(){
        setName("地震");
        setType(earth.getName());
        setPower(100);
        setSkillType(getDirect());
    }
}

class Flamethrower extends Skill{
    Fire fire = new Fire();
    Flamethrower(){
        setName("火炎放射");
        setType(fire.getName());
        setPower(90);
        setSkillType(getSpecial());
    }
}

class FlareBlitz extends Skill{
    Fire fire = new Fire();
    FlareBlitz(){
        setName("フレアドライブ");
        setType(fire.getName());
        setPower(120);
        setSkillType(getDirect());
    }
}

class FocusBlast extends Skill{
    Fighter fighter = new Fighter();
    FocusBlast(){
        setName("気合い玉");
        setType(fighter.getName());
        setPower(110);
        setSkillType(getSpecial());
    }
}

class LeafStorm extends Skill{
    Grass grass = new Grass();
    LeafStorm(){
        setName("リーフストーム");
        setType(grass.getName());
        setPower(130);
        setSkillType(getSpecial());
    }
}

class RockSlide extends Skill{
    Rock rock = new Rock();
    RockSlide(){
        setName("岩雪崩");
        setType(rock.getName());
        setPower(75);
        setSkillType(getDirect());
    }
}

class SludgeBomb extends Skill{
    Poison poison = new Poison();
    SludgeBomb() {
        setName("ヘドロ爆弾");
        setType(poison.getName());
        setPower(90);
        setSkillType(getSpecial());
    }
}

class Thunderbolt extends Skill{
    Electricity electricity = new Electricity();
    Thunderbolt(){
        setName("10万ボルト");
        setType(electricity.getName());
        setPower(90);
        setSkillType(getSpecial());
    }
}

class WeatherBall extends Skill{
    Normal normal = new Normal();
    WeatherBall(){
        setName("ウェザーボール");
        setType(normal.getName());
        setPower(50);
        setSkillType(getSpecial());
    }
}

class WingAttack extends Skill{
    Fright fright = new Fright();
    WingAttack(){
        setName("翼で打つ");
        setType(fright.getName());
        setSkillType(getDirect());
    }
}