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
public class _12 {
    static void guessGender(String name){
        String[] arr = name.split(" ");
        arr[0] = arr[0].toLowerCase();
        arr[arr.length - 1] = arr[arr.length - 1].toLowerCase();
        if(arr[arr.length - 1].equals("kumari"))
            System.out.println("Female");
        else
        {
        switch(arr[0]){
            case "mr." : System.out.println("Male");
                         break;
            case "miss" : System.out.println("Female");
                         break;
            case "mrs" : System.out.println("Married Female");
                         break;
            default : System.out.println("Cannot Determine");
                         break;
        }
       }
    }
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = null;
        if(sc.hasNextLine()){
            str = sc.nextLine();
            }
          guessGender(str);
    }
}
