/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wix1002.lab.pkg03;

/**
 *
 * @author User
 */
import java.util.Scanner;
import java.util.Random;
public class L3Q4 {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner input = new Scanner(System.in);
        
        System.out.println("----Player 1 round----");
        System.out.print("Enter Y to get first dice:");
        input.next();
        int p1_1 = r.nextInt(1,7);
        System.out.println(p1_1);
        System.out.print("Enter Y to get second dice:");
        input.next();
        int p1_2 = r.nextInt(1,7);
        System.out.println(p1_2);
        int score_1 = p1_1+p1_2;
        
        System.out.println("----Player 2 round----");
        System.out.print("Enter Y to get first dice:");
        input.next();
        int p2_1 = r.nextInt(1,7);
        System.out.println(p2_1);
        System.out.print("Enter Y to get second dice:");
        input.next();
        int p2_2 = r.nextInt(1,7);
        System.out.println(p2_2);
        int score_2 = p2_1+p2_2;
        
        if(score_1 == score_2){
            System.out.println("DRAW");
        }else{
            if(score_1>score_2){
                System.out.println("PLAYER 1 WIN!!!");
            }else{
                System.out.println("PLAYER 2 WIN!!!");
            }
        }
    }
}
