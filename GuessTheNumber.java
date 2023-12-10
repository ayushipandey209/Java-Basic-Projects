
package com.mycompany.projects1;

import java.util.*;

class startGame
{
    Random r = new Random();
    startGame()
            {
        Scanner sc=new Scanner(System.in); 
        System.out.println("");
        System.out.println("\t What should be the minimum number ?");
        System.out.print("\t ");
        int min = sc.nextInt();
        System.out.println("\t What should be the maximum number ?");
        System.out.print("\t ");
        int max = sc.nextInt();
        
        int exactn= r.nextInt(max-min+1)+min;
        int tries=0;
        boolean guessed=false;
        
        System.out.println("\t Try to guess the number between : " +min+" and "+max);
        
        while(!guessed)
        {
            System.out.println("\t Enter your guess: ");
            System.out.print("\t ");
            int userg = sc.nextInt();
            tries++;
            
            if(userg==exactn)
            {
                guessed=true;
            }
            else if(userg < exactn)
            {
                System.out.println("\t Too low. Try Again!!");
            }
            else
            {
                System.out.println("\t Too high. Try again!");
            }
        }//while ends
        
                System.out.println("\t Congratulations ! You Guessed the number "+exactn+" in "+tries+" tries.");
            }
}

public class GuessTheNumber 
{
   
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        Random r = new Random();
 // int targetNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
        System.out.println("\t --------------------------- \t");
        System.out.println("\t Welcome to GuessTheNumber!! \t");
        System.out.println("\t --------------------------- \t");
        System.out.println("");
        System.out.print("\t Hello Buddy Your Name -> ");
        String name=sc.nextLine();
        System.out.print("\t Loading");
        try {
           
            for (int i = 0; i < 1; i++) {
                System.out.print(".");
                Thread.sleep(500);  // Sleep for 500 milliseconds (0.5 seconds)
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        startGame ob = new startGame();
    }
    
}
