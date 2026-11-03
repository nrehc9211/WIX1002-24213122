/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutorial.pkg4;

/**
 *
 * @author User
 */
public class T4Q3 {
    public static void main(String[] args) {
        int f1=1;
        int f2=1;
        int temp;
        for(int m=0; m<10; m++){
            switch (m) {
                case 0 -> System.out.print(f1+", ");
                case 1 -> System.out.print(f2+", ");
                default -> {
                    temp = f1+f2;
                    System.out.print(temp + ", ");
                    f1 = f2;
                    f2 = temp;
                }
            }
        }
    }
}
