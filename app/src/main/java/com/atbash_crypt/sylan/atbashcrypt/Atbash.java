package com.atbash_crypt.sylan.atbashcrypt;

import java.util.ArrayList;

public class Atbash {
    private static ArrayList<Character> ALPHABET;

    static {
        ArrayList<Character> temp = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
        	temp.add((char) ('A' + i));
        }
        ALPHABET = temp;
    }
    
    public static String encrypt(String text) {
    	text = text.toUpperCase();
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            if (ALPHABET.contains(text.charAt(i))) {
                    result += ALPHABET.get((25 - ALPHABET.indexOf(text.charAt(i))) 
                    		% 26);
            } else {
                result += text.charAt(i);
            }
        }
        return result;
    }
    
    public static String decrypt(String text) {
    	return Atbash.encrypt(text);
    }
}