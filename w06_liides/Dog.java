/**
 * Dog
 */
public class Dog implements AnimalType {
    
    private int hunger=0;
    private int energy=3;

    public String speak(){
        return "Wuff";
    }
    public void eat(){
        hunger--;
        energy++;
        if(hunger==0){
            System.out.println("Your dog is full");
        }
    }

    public void sleep(){
        energy++;
        if(energy>=7){
            System.out.println("Your dog woke up and is full of energy!");
        }
    }

    public void beSneaky(){
        System.out.println("Your dog is being sneaky");
    }

    public void lookAround(){
        System.out.println("Your dog looks around");
    }

    public void attack(){
        energy--;
        hunger++;
        if(energy<1){
            System.out.println("Your dog needs to rest");
        }else if(hunger>=7){
            System.out.println("You need to feed your dog!");
        }else if(energy<1 && hunger>=7){
            System.out.println("Your dog is hungry and needs to rest. She can't attack right now.");
        }
    }
    
    public void defend(){
        energy--;
        hunger++;
        if(energy<1){
            System.out.println("Your dog needs to rest");
        }else if(hunger>=7){
            System.out.println("You need to feed your dog!");
        }else if(energy<1 && hunger>=7){
            System.out.println("Your dog is hungry and needs to rest. She can't defend herself right now.");
        }
    }    
}