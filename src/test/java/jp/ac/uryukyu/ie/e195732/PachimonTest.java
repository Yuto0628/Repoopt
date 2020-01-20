package jp.ac.uryukyu.ie.e195732;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PachimonTest {
    class Type {
        String name;
        String[] weak;
        String[] resist;
        String[] invalid;

        int compatibilityCorrection(Type executer){
            for (int i=0; i<this.weak.length; i++ )
                if (executer.name.equals(this.weak[i])){
                    return 2;
                }
            for(int i=0; i<this.resist.length; i++)
                if (executer.name.equals(this.resist[i])){
                    return (1/2);
                }
            for(int i=0; i<this.invalid.length; i++){
                if (executer.name.equals(this.invalid[i])){
                    return 0;
                }
            }

            return 1;}

    }
    class Fire extends Type {
        Fire(){
            name = "fire";
            weak = new String[]{"water", "rock", "earth"};
            resist = new String[]{"grass", "insect", "ice", "fairy", "steel"};
            invalid = new String[]{"null"};
        }
    }

    class Ghost extends Type {
        Ghost(){
            name = "ghost";
            weak = new String[]{"evil"};
            resist = new String[]{"poison"};
            invalid = new String[]{"normal"};
        }
    }

    class Grass extends Type{
        Grass(){
            name = "grass";
            weak = new String[]{"fire"};
            resist = new String[]{"water"};
            invalid = new String[]{};
        }
    }

    class Normal extends Type{
        Normal(){
            name = "normal";
            weak = new String[]{"fighter"};
            resist = new String[]{"fire", "ice"};
            invalid = new String[]{"ghost"};
        }
    }

    class Water extends Type{
        Water(){
            name = "water";
            weak = new String[]{"grass", "electricity"};
            resist = new String[]{"fire", "ice"};
            invalid = new String[]{};
        }
    }
    Fire  fire = new Fire();
    Grass grass = new Grass();
    Water water = new Water();
    Normal normal = new Normal();
    Ghost ghost = new Ghost();
    @Test
    public void doTest(){
        assertEquals(2, fire.compatibilityCorrection(water));
        assertEquals(1, water.compatibilityCorrection(normal));
        assertEquals(1/2, grass.compatibilityCorrection(water));
        assertEquals(0, normal.compatibilityCorrection(ghost));
    }
}
