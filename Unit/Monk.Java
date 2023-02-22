package Unit;
public class Monk extends Stats{
    int flashHeal;
    int greatHeal;
    int ressurection; // Воскрешает союзника
    int manaRecovery; // Дает/восполняет ману
    int Acceleration; // На 2 хода увеличивает скорость союзников
    public Monk(int hp, int attack, int def, int mana, int speed,int intellect, int hit) {
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