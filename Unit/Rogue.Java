package Unit;
public class Rogue extends Stats{
    int stealth; // Нельзя взять в цель, раскрывается если на соседней клетке стоит вражеский юнит, увеличивает урон от первого удара из невидимости
    int arrowProtection; // Пассивная защита от лучников на 50%
    int pickingPockets; // можно своровать оружие/зелья, после чего выводит из невидимости
    int invenom; //Наносит урон + вешает яд на переод. урон
    public Rogue(int hp, int attack, int def, int mana, int speed,int intellect, int hit) {
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
}