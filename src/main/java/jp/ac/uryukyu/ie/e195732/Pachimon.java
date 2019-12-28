package jp.ac.uryukyu.ie.e195732;

public class Pachimon {
    protected int HP;
    protected int ATTACK;
    protected int BLOCK;
    protected int CONTACT;
    protected int DIFFENCET;
    protected int SPEED;

    protected int raceValueHp;
    protected int raceValueAttack;
    protected int raceValueBlock;
    protected int raceValueContact;
    protected int raceValueDiffencet;
    protected int raceValueSpeed;

    Pachimon(int HP)
    {
        this.HP = culcHp()
    }
    int culcHp(int raceValue) {
        return  (int)Math.floor((raceValue* 2+ 31)* 50 /100) + 50 + 10;
    }

    int culcStatus(int raceValue) {
        return  (int)Math.floor((raceValue* 2+ 31)* 50 /100) + 5;
    }
}

class Venusaur extends Pachimon{
    private int raceValueHP = 80;
    private int raceValueATTACK = 82;
    private int raceValueBLOCK = 83;
    private int raceValueCONTACK = 100;
    private int raceValueDIFFENCET = 100;
    private int raceValueSPEED = 80;

        Venusaur(){
            super.HP = culcHp(raceValueHP);
            super.ATTACK = culcStatus(raceValueATTACK);
            super.BLOCK = culcStatus(raceValueBLOCK);
            super.CONTACT = culcStatus(raceValueCONTACK);
            super.DIFFENCET = culcStatus(raceValueDIFFENCET);
            super.SPEED = culcStatus(raceValueSPEED);
        }
}

class Charizard extends Pachimon{
    private int raceValueHP = 78;
    private int raceValueATTACK = 84;
    private int raceValueBLOCK = 78;
    private int raceValueCONTACK = 109;
    private int raceValueDIFFENCET = 85;
    private int raceValueSPEED = 100;

    Charizard(){
        super.HP = culcHp(raceValueHP);
        super.ATTACK = culcStatus(raceValueATTACK);
        super.BLOCK = culcStatus(raceValueBLOCK);
        super.CONTACT = culcStatus(raceValueCONTACK);
        super.DIFFENCET = culcStatus(raceValueDIFFENCET);
        super.SPEED = culcStatus(raceValueSPEED);
    }
}

class Blastoise extends Pachimon{
    private int raceValueHP = 79;
    private int raceValueATTACK = 83;
    private int raceValueBLOCK = 100;
    private int raceValueCONTACK = 85;
    private int raceValueDIFFENCET = 105;
    private int raceValueSPEED = 78;

    Blastoise(){
        super.HP = culcHp(raceValueHP);
        super.ATTACK = culcStatus(raceValueATTACK);
        super.BLOCK = culcStatus(raceValueBLOCK);
        super.CONTACT = culcStatus(raceValueCONTACK);
        super.DIFFENCET = culcStatus(raceValueDIFFENCET);
        super.SPEED = culcStatus(raceValueSPEED);
    }
}

class Raichu extends Pachimon{
    private int raceValueHP = 60;
    private int raceValueATTACK = 90;
    private int raceValueBLOCK = 55;
    private int raceValueCONTACK = 90;
    private int raceValueDIFFENCET = 80;
    private int raceValueSPEED = 100;

    Raichu(){
        super.HP = culcHp(raceValueHP);
        super.ATTACK = culcStatus(raceValueATTACK);
        super.BLOCK = culcStatus(raceValueBLOCK);
        super.CONTACT = culcStatus(raceValueCONTACK);
        super.DIFFENCET = culcStatus(raceValueDIFFENCET);
        super.SPEED = culcStatus(raceValueSPEED);
    }
}

class Snorlax extends Pachimon{
    private int raceValueHP = 160;
    private int raceValueATTACK = 110;
    private int raceValueBLOCK = 65;
    private int raceValueCONTACK = 65;
    private int raceValueDIFFENCET = 110;
    private int raceValueSPEED = 30;

    Snorlax(){
        super.HP = culcHp(raceValueHP);
        super.ATTACK = culcStatus(raceValueATTACK);
        super.BLOCK = culcStatus(raceValueBLOCK);
        super.CONTACT = culcStatus(raceValueCONTACK);
        super.DIFFENCET = culcStatus(raceValueDIFFENCET);
        super.SPEED = culcStatus(raceValueSPEED);
    }
}

class Aerodactyl extends Pachimon{
    private int raceValueHP = 80;
    private int raceValueATTACK = 105;
    private int raceValueBLOCK = 65;
    private int raceValueCONTACK = 60;
    private int raceValueDIFFENCET = 75;
    private int raceValueSPEED = 130;

    Aerodactyl(){
        super.HP = culcHp(raceValueHP);
        super.ATTACK = culcStatus(raceValueATTACK);
        super.BLOCK = culcStatus(raceValueBLOCK);
        super.CONTACT = culcStatus(raceValueCONTACK);
        super.DIFFENCET = culcStatus(raceValueDIFFENCET);
        super.SPEED = culcStatus(raceValueSPEED);
    }
}