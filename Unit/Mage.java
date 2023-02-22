package Unit;
public class Mage extends Stats{
    int fireBall;
    int frostBall;
    int meteorStorm; //Наносит урон по площади
    int blink;  // Перемещается на 4 клетки вперед

    public Mage(int hp, int attack, int def, int mana, int speed,int intellect, int hit) {
        super(hp, attack, def, mana, speed, intellect, hit);
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
}
