/**
 * KitchenEquipment
 */
public abstract class KitchenEquipment {

    protected String kind;
    protected String modelnr;
    protected String function;
    protected String color;
    
    public KitchenEquipment(String kind,String modelnr,String function,String color){
        this.kind=kind;
        this.modelnr=modelnr;
        this.function=function;
        this.color=color;
    }
    public void whatAmI(String kind, String modelnr2, String color){
        System.out.println("This is a "+this.kind+" and the modelnumber is "+this.modelnr+".It has the color "+this.color+".");

    }
    public void howDoIwork(String function){
        System.out.println("The "+kind+ " function is "+function+".");

    }
    
}