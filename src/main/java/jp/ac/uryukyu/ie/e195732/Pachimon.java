package jp.ac.uryukyu.ie.e195732;

import java.util.Random;

class Pachimon {
    private boolean dead = false;
    private String name;
    private Type[] type;
    private Skill[] skills;
    private int raceHp;
    private int raceAttack;
    private int raceBlock;
    private int raceContact;
    private int raceDiffence;
    private int raceSpeed;
    private int maxHp;
    private int hp;
    private int attack;
    private int brock;
    private int contact;
    private int diffence;
    private int speed;

    int culcHp(int raceHp) {
        return (int) Math.floor((raceHp * 2 + 31) * 50 / 100) + 50 + 10;
    }

    int culcStatus(int raceValue) {
        return (int) Math.floor((raceValue * 2 + 31) * 50 / 100) + 5;
    }

    void execute(Pachimon target, Skill skill) {
        Random random = new Random();
        int compatibility = 1;
        int randomInt = (85 + random.nextInt(16));
        if (skill.getSkillType().equals(skill.getDirect())) {
            for (int i = 0; i < target.getType().length; i++) {
                compatibility = compatibility * target.getType()[i].typeCompatibilityCorrection(skill.getType());
            } //タイプ相性補正
            int damage = (int) (Math.floor((Math.floor(22 * this.attack * skill.getPower() / 50 / target.getBrock() + 2) * randomInt) / 100));
            target.setHp(target.getHp() - damage);
        }
        if (skill.getSkillType().equals(skill.getSpecial())) {
            for (int i = 0; i < target.getType().length; i++) {
                compatibility = compatibility * target.getType()[i].typeCompatibilityCorrection(skill.getType());
            } //タイプ相性補正
            int damage = (int) (Math.floor((Math.floor(22 * this.contact * skill.getPower() * compatibility / 50 / target.getDiffence() + 2) * randomInt) / 100));
            target.setHp(target.getHp() - damage);
        }
    }

    public void setDead(boolean dead) { dead = dead; }

    public void setName(String name) { this.name = name; }

    public void setType(Type[] type) { this.type = type; }

    public void setSkills(Skill[] skills) { this.skills = skills; }

    public void setMaxHp(int maxHp) { this.maxHp = maxHp; }

    public void setHp(int hp) { this.hp = hp; }

    public void setAttack(int attack) { this.attack = attack; }

    public void setBrock(int brock) { this.brock = brock; }

    public void setContact(int contact) { this.contact = contact; }

    public void setDiffence(int diffence) { this.diffence = diffence; }

    public void setSpeed(int speed) { this.speed = speed; }

    public void setRaceHp(int raceHp) { this.raceHp = raceHp; }

    public void setRaceAttack(int raceAttack) { this.raceAttack = raceAttack; }

    public void setRaceBlock(int raceBlock) { this.raceBlock = raceBlock; }

    public void setRaceContact(int raceContact) { this.raceContact = raceContact; }

    public void setRaceDiffence(int raceDiffence) { this.raceDiffence = raceDiffence; }

    public void setRaceSpeed(int raceSpeed) { this.raceSpeed = raceSpeed; }

    public boolean isDead(){return dead;}

    public String getName() { return name; }

    public Type[] getType() { return type; }

    public Skill[] getSkills() { return skills; }

    public int getRaceHp() { return raceHp; }

    public int getRaceAttack() { return raceAttack;}

    public int getRaceBlock() { return raceBlock; }

    public int getRaceContact() { return raceContact; }

    public int getRaceDiffence() { return raceDiffence; }

    public int getRaceSpeed() { return raceSpeed; }

    public int getMaxHp() { return maxHp; }

    public int getHp() { return hp; }

    public int getBrock() { return brock; }

    public int getDiffence() { return diffence; }

    public int getSpeed() { return speed; }
}

class Venusaur extends Pachimon {
    Venusaur() {
        setName("フシギバナ");
        setType(new Type[]{new Grass(), new Poison()});
        setSkills(new Skill[]{new LeafStorm(), new SludgeBomb(), new WeatherBall(), new BodySlam()});

        setRaceHp(80);
        setRaceAttack(82);
        setRaceBlock(83);
        setRaceContact(100);
        setRaceDiffence(100);
        setRaceSpeed(80);

        setMaxHp(culcHp(getRaceHp()));
        setHp(culcHp(getRaceHp()));
        setAttack(culcStatus(getRaceAttack()));
        setBrock(culcStatus(getRaceBlock()));
        setContact(culcStatus(getRaceContact()));
        setDiffence(culcStatus(getRaceDiffence()));
        setSpeed(culcStatus(getRaceSpeed()));
    }
}

class Charizard extends Pachimon {
    Charizard() {
        setName("リザードン");
        setType(new Type[]{new Fire(), new Fright()});
        setSkills(new Skill[]{new AirSlash(), new FlareBlitz(), new Earthquake(), new FocusBlast()});

        setRaceHp(78);
        setRaceAttack(84);
        setRaceBlock(78);
        setRaceContact(109);
        setRaceDiffence(85);
        setRaceSpeed(100);

        setMaxHp(culcHp(getRaceHp()));
        setHp(culcHp(getRaceHp()));
        setAttack(culcStatus(getRaceAttack()));
        setBrock(culcStatus(getRaceBlock()));
        setContact(culcStatus(getRaceContact()));
        setDiffence(culcStatus(getRaceDiffence()));
        setSpeed(culcStatus(getRaceSpeed()));
    }
}

class Blastoise extends Pachimon{
    Blastoise(){
        setName("カメックス");
        setType(new Type[]{new Water()});
        setSkills(new Skill[]{new AquaTail(), new BrickBreak(), new DragonPulse(), new BodySlam()});

        setRaceHp(79);
        setRaceAttack(83);
        setRaceBlock(100);
        setRaceContact(85);
        setRaceDiffence(105);
        setRaceSpeed(78);

        setMaxHp(culcHp(getRaceHp()));
        setHp(culcHp(getRaceHp()));
        setAttack(culcStatus(getRaceAttack()));
        setBrock(culcStatus(getRaceBlock()));
        setContact(culcStatus(getRaceContact()));
        setDiffence(culcStatus(getRaceDiffence()));
        setSpeed(culcStatus(getRaceSpeed()));
    }
}

class Raichu extends Pachimon{
    Raichu(){
        setName("ライチュウ");
        setType(new Type[]{new Electricity()});
        setSkills(new Skill[]{new Thunderbolt(), new FocusBlast(), new BrickBreak(), new BodySlam()});

        setRaceHp(60);
        setRaceAttack(90);
        setRaceBlock(55);
        setRaceContact(90);
        setRaceDiffence(80);
        setRaceSpeed(110);

        setMaxHp(culcHp(getRaceHp()));
        setHp(culcHp(getRaceHp()));
        setAttack(culcStatus(getRaceAttack()));
        setBrock(culcStatus(getRaceBlock()));
        setContact(culcStatus(getRaceContact()));
        setDiffence(culcStatus(getRaceDiffence()));
        setSpeed(culcStatus(getRaceSpeed()));
    }
}

class Aerodactyl extends Pachimon{
    Aerodactyl(){
        setName("プテラ");
        setType(new Type[]{new Rock(), new Fright()});
        setSkills(new Skill[]{new Crunch(), new RockSlide(), new WingAttack(), new AquaTail()});

        setRaceHp(80);
        setRaceAttack((105));
        setRaceBlock(65);
        setRaceContact(60);
        setRaceDiffence(75);
        setRaceSpeed(130);

        setMaxHp(culcHp(getRaceHp()));
        setHp(culcHp(getRaceHp()));
        setAttack(culcStatus(getRaceAttack()));
        setBrock(culcStatus(getRaceBlock()));
        setContact(culcStatus(getRaceContact()));
        setDiffence(culcStatus(getRaceDiffence()));
        setSpeed(culcStatus(getRaceSpeed()));
    }
}

class Snorlax extends Pachimon{
    Snorlax(){
        setName("カビゴン");
        setType(new Type[]{new Normal()});
        setSkills(new Skill[]{new BodySlam(), new Earthquake(), new Crunch(), new Flamethrower()});

        setRaceHp(160);
        setRaceAttack((110));
        setRaceBlock(65);
        setRaceContact(65);
        setRaceDiffence(110);
        setRaceSpeed(30);

        setMaxHp(culcHp(getRaceHp()));
        setHp(culcHp(getRaceHp()));
        setAttack(culcStatus(getRaceAttack()));
        setBrock(culcStatus(getRaceBlock()));
        setContact(culcStatus(getRaceContact()));
        setDiffence(culcStatus(getRaceDiffence()));
        setSpeed(culcStatus(getRaceSpeed()));
    }
}