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
import java.util.Scanner;
public class _3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = null;
        int count = 0;
        if(sc.hasNextLine())
        {
            str = sc.nextLine();
            for(int i = 0; i < str.length(); i++){
                if(Character.isUpperCase(str.charAt(i)))
                    count++;
            }
        }
        System.out.println("Number of Capital Letters are: " + count);
    }
}
