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
public class _7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = null;
        int day = 0;
        if(sc.hasNextLine()){
            str = sc.nextLine();
            
        }
        switch(str.toLowerCase()){
            case "monday" : day = 1;
                            break;
            case "tuesday" : day = 2;
                            break;
            case "wednesday" : day = 3;
                            break;
            case "thursday" : day = 4;
                            break;
            case "friday" : day = 5;
                            break;
            case "saturday" : day = 6;
                            break;
            case "sunday" : day = 7;
                            break;
        }
        if(day != 0)
            
            System.out.println(str + ": " + day);
        else
            System.out.println(str + ": Invalid Day");
    }
}
