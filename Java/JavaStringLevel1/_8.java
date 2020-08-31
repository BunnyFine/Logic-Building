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
public class _8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = null;
        char[] arr;
        if(sc.hasNextLine()){
            str = sc.nextLine();
            arr = str.toCharArray();
        for(int i = 0; i < arr.length; i++){
            if(Character.isUpperCase(arr[i])){
                arr[i] = Character.toLowerCase(arr[i]);
            }
            else if(Character.isLowerCase(arr[i])){
                  arr[i] = Character.toUpperCase(arr[i]);
            }
            System.err.print(arr[i]);
        }
//            System.out.println(str);
        }
        }
}
