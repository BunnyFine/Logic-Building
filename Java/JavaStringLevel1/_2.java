/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaStringLevel1;

/**
 *
 * @author SHASHWAT-PC
 */
import java.util.*;
public class _2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fName = null, mName = null, lName = null;
        System.out.println("First Name: ");
        if(sc.hasNextLine()){
            fName = sc.nextLine();
        }
        System.out.println("Middle Name: ");
        if(sc.hasNextLine()){
            mName = sc.nextLine();
        }
        System.out.println("Last Name: ");
        if(sc.hasNextLine()){
            lName = sc.nextLine();
        }
        if(fName != null && mName != null && lName != null)
            System.out.println(fName + " " + mName + " " + lName + " : " + fName.charAt(0) + "." + mName.charAt(0) + "." + lName.charAt(0));
        else
            System.out.println("Execption");
    }
}
