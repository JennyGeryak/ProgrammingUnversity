package Lab1;

import java.util.Scanner;

/**
 * Created by Jane on 31.05.2017.
 * java
 */
public class Task04 {
    public static void main(String[] args){

        String text = "sdfsdf sfsdfsd s sf s fsf sf s sdf ";
        int k = 3;
        char character = 'o';

        String[] words = text.split(" ");

        for ( int i=0 ; i < words.length ; i++) {

            if(k<=words[i].length()){
                char[] myNameChars = words[i].toCharArray();
                myNameChars[k-1] = character;
                words[i] = String.valueOf(myNameChars);
            }

            System.out.println(words[i]);
        }
    }
}
