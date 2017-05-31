package Lab2;

/**
 * Created by Jane on 31.05.2017.
 * java
 */
public class Task06 {
    public static void main(String[] args){
        Dog dog1 = new Dog("Snejok", 2);
        dog1.SayRaf();

        Dog dog2 = new Dog("Pushistic", 1);
        dog2.SayRaf();

        Detail Item = new Detail("Refrejerator", "gorenje","Slovenje", "Very cold one \ni swear", 2010, 6, 12);
        long Time = Item.getTimeAfterCreation();
        System.out.print(Time);
        System.out.println(" ms");
        System.out.println(Item.getDescription());

    }
}
