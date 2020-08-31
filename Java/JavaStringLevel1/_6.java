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
public class _6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = null, str2 = null;
        if(sc.hasNextLine())
            str1 = sc.nextLine();
        if(sc.hasNextLine())
            str2 = sc.nextLine();
        if(str1 != null && str2 != null)
            System.err.println(str1 + " equals " + str2 + " : " + str1.equals(str2));
        else
            System.err.println("Exception");
            
    }
}
