package Unit;
public class Sniper extends Stats{
    int sniperShot; //Через 2 хода наносит урон, увеличенный в 2.5 раза
    int ammo;
    int rateOfFire; // Увеличивает собственную скорость + урон на 3 хода
    int aspidShot; // Наносит урон+ период
    public Sniper(int hp, int attack, int def, int mana, int speed, int intellect, int hit) {
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
    public int Reload(){
        return 0;
    }
}
