
public class Microwave extends KitchenEquipment{

    public int maxHeat=100;
    public int programms=7;
    public Microwave(String kind, String string, String function, String color) {
        super(kind, string, function, color);
        // TODO Auto-generated constructor stub
    }

    public void whatAmI() {
        super.whatAmI(kind,modelnr,color);
        System.out.println("It has "+programms+"programms.");
    }
    public void howDoIwork(){
        super.howDoIwork(function);
        System.out.println("It can produce heat up to "+maxHeat+" degrees.");
    }
}