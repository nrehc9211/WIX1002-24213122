/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutorial.pkg4;

/**
 *
 * @author User
 */
public class T4Q2 {
    public static void main(String[] args) {
        System.out.println(" ");
        System.out.println("a.");
        int sum =0;
        for(int x=10; x>0;x--)
            sum+=x;
        
                    
        System.out.println(" ");
        System.out.println("b.");
        int x=0,y=0;
        do{
            x+=2;
            y+=x;
            System.out.println(x+" and " +y);
        }while(x<100);
        
        System.out.println(" ");
        System.out.println("c.");
        // for(int x=1,int y=20; x<y ;x++,y-=2){
            // System.out.println(x+" "+y);
        // }
        
        System.out.println(" ");
        System.out.println("d.");
        int i=1;
        while(i<=10){
            if(i==10)
                System.out.println("Program End");
            i++;
        }
    }
}
