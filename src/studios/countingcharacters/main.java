package org.launchcode.java.studios.countingcharacters;

import java.util.HashMap;
import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

//        ArrayList occurances = new ArrayList();
        HashMap<Character, Integer> occurances = new HashMap();

        for (char character: text.toLowerCase().toCharArray()) {
            if (Character.isLetter(character)) {
                if (occurances.get(character) != null) {
                    occurances.put(character, occurances.get(character) + 1);
                } else {
                    occurances.put(character, 1);
                }
            }
        }

        System.out.println(occurances.toString());

    }
}