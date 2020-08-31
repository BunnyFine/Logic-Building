/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaStringLevel1;

import java.util.Scanner;

/**
 *
 * @author SHASHWAT-PC
 */

public class _4 {
    static boolean isVowel(Character ch){
        if(ch.equals('a') || ch.equals('e') || ch.equals('i') || ch.equals('o') || ch.equals('u'))
            return true;
        return false;
    }
    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
        String str = null;
        int count = 0;
        if(sc.hasNextLine())
        {
            str = sc.nextLine();
            str = str.toLowerCase();
            for(int i = 0; i < str.length(); i++){
                if(isVowel(str.charAt(i)))
                    count++;
            }
        }
        System.out.println("Number of vowels are: " + count);
    }
}
