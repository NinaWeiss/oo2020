/**
 * Cat
 */
public class Cat implements AnimalType{
    private int hunger = 0;
    private int energy = 3;

    public String speak() {
        return "Meow";
    }

    public void eat(){
        hunger--;
        energy++;
        if(hunger<1){
            System.out.println("Your cat is full");
        }
    }

    public void sleep(){
        energy++;
        if(energy>=5){
            System.out.println("Your cat woke up and is full of energy!");
        }
    }

    public void beSneaky() {
        System.out.println("Your cat is being sneaky");
    }

    public void lookAround() {
        System.out.println("Your cat looks around");
    }

    public void attack(){
        energy--;
        hunger++;
        if(energy<1){
            System.out.println("Your cat needs to rest");
        }else if(hunger>=5){
            System.out.println("You need to feed your cat!");
        }else if(energy<1 && hunger>=5){
            System.out.println("Your cat is hungry and needs to rest. She can't attack right now.");
        }
    }

    public void defend(){
        energy--;
        hunger++;
        if(energy<1){
            System.out.println("Your cat needs to rest");
        }else if(hunger>=5){
            System.out.println("You need to feed your cat!");
        }else if(energy<1 && hunger>=5){
            System.out.println("Your cat is hungry and needs to rest. She can't defend herself right now.");
        }
    }
}