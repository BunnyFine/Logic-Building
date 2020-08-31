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
public class _5 {
    
    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
        String str = null;
        String[] arr;
        int count = 0;
        if(sc.hasNextLine())
        {
            str = sc.nextLine();
            arr = str.split(" ");
            count = arr.length;
        }
        System.out.println("Number of words are: " + count);
    }
}
