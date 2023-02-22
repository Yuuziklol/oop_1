import Unit.Archer;
import Unit.Farmer;
import Unit.Mage;
import Unit.Archer;
import Unit.Monk;
import Unit.Rogue;
import Unit.Sniper;
/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        Farmer farmer = new Farmer(100, 2, 2, 0, 4, 0, 2);
        Archer archer = new Archer(200, 5, 3, 50, 6, 2, 5);
        Mage mage = new Mage(80, 1, 2, 200, 5, 5, 3);
        Monk monk new Monk(100,2,3,300,6,5,2);
        Rogue rogue = new Rogue (80,7,1,0,7,0,4);
        Sniper sniper = new Sniper(100, 6, 2, 50, 6, 2, 7);
    }   
}
