package Lab1;

import java.util.Scanner;

/**
 * Created by Jane on 31.05.2017.
 * java
 */
public class Task06 {
    public static void main(String[] args) {

        String text = "";
        System.out.println("Введите текст");
        Scanner sc1 = new Scanner(System.in);
        text = sc1.nextLine();

        char[] charArray = text.toCharArray();

        for(char x : charArray){
            if(Character.isLetter(x)){
                System.out.print(x + " ");
            }
        }

    }
}
