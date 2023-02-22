package Unit;
public class Farmer extends Stats{
    int pitchfork; //Удар вилами
    int giveAmmo; //Дает патроны/стрелы
    public Farmer(int hp, int attack, int def, int mana, int speed,int intellect, int hit) {
        super(hp,attack,def,mana,speed,intellect,hit);
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

