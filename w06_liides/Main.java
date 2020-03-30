/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Cat kitty = new Cat();
        Dog doggy= new Dog();
        kitty.attack();
        kitty.attack();
        kitty.attack();
        doggy.sleep();
        EstonianCitizen maali=new EstonianCitizen();
        System.out.println("Age is "+ maali.getAge());
        System.out.println("Gender is "+ maali.getGender());
        System.out.println("Day of birth is "+ maali.getDay());
        System.out.println("Month of birth is "+ maali.getMonth());
        System.out.println("Year of birth is "+ maali.getYear());
        FinnishCitizen juku=new FinnishCitizen();
        System.out.println("Age is "+ juku.getAge());
        System.out.println("Gender is "+ juku.getGender());
        System.out.println("Day of birth is "+ juku.getDay());
        System.out.println("Month of birth is "+ juku.getMonth());
        System.out.println("Year of birth is "+ juku.getYear());
    }
}