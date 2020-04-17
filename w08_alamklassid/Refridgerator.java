/**
 * Refridgerator
 */
public class Refridgerator extends KitchenEquipment {

    public Refridgerator(String kind, String string, String function, String color) {
        super(kind, string, function, color);
        // TODO Auto-generated constructor stub
    }
    public void whatAmI(){
        super.whatAmI(kind, modelnr, color);
    }
    public void howDoIwork(){
        super.howDoIwork(function);
    }

    
}