package Lab2;

/**
 * Created by Jane on 31.05.2017.
 * java
 */
public class Dog {
    public static int count = 0;
    int age;
    String name;

    public Dog(){
        this.age = 0;
        this.name = "Neznayometc";
        ++count;
    }
    public Dog(String name, int age){
        this.age = age;
        this.name = name;
        ++count;
    }

    public void SayRaf(){
        for(int i = 0; i < this.age; i++){
            System.out.println("гав");
        }
    }
}
