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
public class _10 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = null;
        String[] arr;
        boolean flag = true;
        if(sc.hasNextLine()){
            str = sc.nextLine();
            arr = str.split(" ");
            System.out.println(str + ": " + arr[0].charAt(arr[0].length()-1) + " " + arr[1]);
        }
    }
}
