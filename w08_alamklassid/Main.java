
public class Main {
    public static void main(String[] args) {
        Microwave m=new Microwave("Microwave", "A19-7654", "heeting", "white");
        Oven o=new Oven("Oven","PPO-L98F","heeting","red");
        Refridgerator r=new Refridgerator("Fridge", "RF-009", "cooling", "blue");
        m.whatAmI();
        m.howDoIwork();
        o.whatAmI();
        o.howDoIwork();
        r.whatAmI();
        r.howDoIwork();
    }

}