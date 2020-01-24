package jp.ac.uryukyu.ie.e195732;

/**
 * タイプの弱点や抵抗、無効にするタイプをまとめたクラス。サブクラスでそれぞれのタイプごとの弱点や抵抗、無効にするタイプを決定する。
 */
class Type {
    private String name;
    private String[] weak;
    private String[] resist;
    private String[] invalid;

    /**
     * タイプ相性を元に補正を返すメソッド。この補正を元に最終的な技の威力を決定する。
     * @param type 相性を確認するタイプ
     * @return
     */
    double typeCompatibilityCorrection(String type){
        for (int i=0; i<this.weak.length; i++ )
            if (type.equals(this.weak[i])){ return 2; }

        for(int i=0; i<this.resist.length; i++)
            if (type.equals(this.resist[i])){ return 0.5; }

        for(int i=0; i<this.invalid.length; i++)
            if (type.equals(this.invalid[i])){ return 0; }

        return 1;}


    public void setName(String name) {
        this.name = name;
    }

    public void setWeak(String[] weak) {
        this.weak = weak;
    }

    public void setResist(String[] resist) {
        this.resist = resist;
    }

    public void setInvalid(String[] invalid) {
        this.invalid = invalid;
    }

    public String getName() { return name; }
}

class Dragon extends Type{
    Dragon(){
        setName("dragon");
        setWeak(new String[]{"dragon", "fairy", "ice"});
        setResist(new String[]{"electricity", "fire", "grass", "water"});
        setInvalid(new String[]{});
    }

}

class Earth extends Type{
    Earth(){
        setName("earth");
        setWeak(new String[]{"grass", "ice", "water"});
        setResist(new String[]{"poison", "rock"});
        setInvalid(new String[]{"electricity"});
    }

}

class Electricity extends Type{
    Electricity(){
        setName("electricity");
        setWeak(new String[]{"earth"});
        setResist(new String[]{"electricity", "fright", "steel"});
        setInvalid(new String[]{});
    }
}

class Esper extends Type{
    Esper(){
        setName("esper");
        setWeak(new String[]{"evil", "ghost", "insect"});
        setResist(new String[]{"esper", "fighter"});
        setInvalid(new String[]{});
    }
}

class Evil extends Type{
    Evil(){
        setName("evil");
        setWeak(new String[]{"fairy", "fighter", "insect"});
        setResist(new String[]{"ghost", "evjl"});
        setInvalid(new String[]{"esper"});
    }
}

class Fairy extends Type{
    Fairy(){
        setName("fairy");
        setWeak(new String[]{"poison", "steel"});
        setResist(new String[]{"evil", "fighter", "insect"});
        setInvalid(new String[]{"dragon"});
    }
}

class Fighter extends Type{
    Fighter(){
        setName("fighter");
        setWeak(new String[]{"esper", "fairy", "fright"});
        setResist(new String[]{"evil", "insect", "rock"});
        setInvalid(new String[]{});
    }
}

class Fire extends Type{
    Fire(){
        setName("fire");
        setWeak(new String[]{"earth", "rock", "water"});
        setResist(new String[]{"fairy", "grass", "ice", "insect", "steel"});
        setInvalid(new String[]{});
    }
}

class Fright extends Type{
    Fright(){
        setName("fright");
        setWeak(new String[]{"electricity", "ice", "rock"});
        setResist(new String[]{"insect", "grass"});
        setInvalid(new String[]{"earth"});
    }
}

class Ghost extends Type{
    Ghost(){
        setName("ghost");
        setWeak(new String[]{"evil", "ghost"});
        setResist(new String[]{"insect", "poison"});
        setInvalid(new String[]{"normal"});
    }
}

class Grass extends Type{
    Grass(){
        setName("grass");
        setWeak(new String[]{"fright", "fire", "ice", "insect", "poison"});
        setResist(new String[]{"earth", "rock", "water"});
        setInvalid(new String[]{});
    }
}

class Ice extends Type{
    Ice(){
        setName("ice");
        setWeak(new String[]{"fire", "fighter", "rock", "steel"});
        setResist(new String[]{"ice"});
        setInvalid(new String[]{});
    }
}

class Insect extends Type{
    Insect(){
        setName("insect");
        setWeak(new String[]{"fire", "fright", "rock"});
        setResist(new String[]{"earth", "rock", "water"});
        setInvalid(new String[]{});
    }
}

class Normal extends Type{
    Normal(){
        setName("normal");
        setWeak(new String[]{"fighter"});
        setResist(new String[]{});
        setInvalid(new String[]{"ghost"});
    }
}

class Poison extends Type{
    Poison(){
        setName("poison");
        setWeak(new String[]{"earth", "esper"});
        setResist(new String[]{"fairy", "fighter", "grass", "insect", "poison"});
        setInvalid(new String[]{});
    }
}

class Rock extends Type{
    Rock(){
        setName("rock");
        setWeak(new String[]{"fighter", "earth", "grass", "steel", "water"});
        setResist(new String[]{"fire", "fright", "normal", "poison"});
        setInvalid(new String[]{});
    }
}

class Steel extends Type{
    Steel(){
        setName("steel");
        setWeak(new String[]{"earth", "fire", "fighter"});
        setResist(new String[]{"dragon", "esper", "fairy", "fright", "grass", "ice", "insect", "normal", "rock", "steel"});
        setInvalid(new String[]{"poison"});
    }
}

class Water extends Type{
    Water(){
        setName("water");
        setWeak(new String[]{"electricity", "grass"});
        setResist(new String[]{"fire", "ice", "steel", "water"});
        setInvalid(new String[]{});
    }
}