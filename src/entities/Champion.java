package entities;

public class Champion {
    
    String name;
    int life;
    int attack;
    int armor;

    public String getName() {
        return name;
    }
    public int getLife() {
        return life;
    }
    public int getAttack() {
        return attack;
    }
    public int getArmor() {
        return armor;
    }

    public Champion (String name, int life, int attack, int armor){
        this.name = name;
        this.life = life;
        this.attack = attack;
        this.armor = armor;
    }

    public void takeDamage(Champion other){
        if (this.armor > other.attack) {
            this.life -= 1;
        }
        else{
            this.life += this.armor - other.attack;
        }
    }

    public String status(){
        if(life <= 0){
            return name
            + ": 0 de vida (morreu)";
        }
        else{
            return name
            + ": "
            + life
            + " de vida";
        }
    }
}