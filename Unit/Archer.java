package Unit;
public class Archer extends Stats {
    int ammo;
    int flameArrow; // Наносит повреждения + период.урон
    int frostArrow; // Наносит повреждения + снижает скорость передвижения
    int bowSkill; // Пассивное умение на владение луком/арбалетом
    public Archer(int hp, int attack, int def, int mana, int speed, int intellect, int hit) {
        super(hp, attack, def, mana, speed,intellect, hit);
    }
    public int Damage(){
        return 0;
    }
    public int Wait(){
        return 0;
    }
    public int Defence(){
        return 0;
    }
    public int getDamage(){
        return 0;
    }
    public int getHp(){
        return 0;
    }
    public int getMana(){
        return 0;
    }
    public int Reload(){
        return 0;
    }
}
