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
public class _9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = null;
        boolean flag = true;
        if(sc.hasNextLine()){
            str = sc.nextLine();
            for(int i = 0; i < str.length()/2; i++){
                if(str.charAt(i) != str.charAt(str.length()-i-1))
                {
                    flag = false;
                    break;
                }
            }
            if(flag)
                System.out.println("True");
            else
                System.out.println("False");
        }
    }
}
