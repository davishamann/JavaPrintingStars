/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.printingstarsdavishamann;

/**
 *
 * @author davis
 */
public class printingstarsdavishamann {
    public static void main(String[] args) 
    {
        System.out.println("Question 1.");
        
        for(int i=1; i<=5; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println("\n");
        }
        
        int space_count=5;
        System.out.println("Question 2.");
        for(int i=1; i<=5; i++)
        {
            for(int j=1; j<=space_count; j++)
            {
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            space_count--;
            System.out.println("\n");
        }
        System.out.println("Question 3.");
        space_count=5;
        for(int i=0;i<5;i++){
            for(int j=0;j<space_count;j++){
                System.out.print(" ");
            }
            for(int j=0;j<=i*2;j++){
                System.out.print("*");
            }
            space_count--;
            System.out.println("\n");
        }
        System.out.println("Question 4.");
        int numberofline=7;
        int numberofspace=(numberofline/2)+1;
        int numberofstar=1;
        for(int i=1; i<=numberofline+1;i++){
            if(i<=(numberofline/2)+1){
                for(int j=1;j<=numberofspace;j++)
                {
                    System.out.print(" ");
                }
                numberofspace--;
                for(int j=0;j<numberofstar;j++)
                {
                    System.out.print("*");
                }
                numberofstar+=2;
                System.out.println("\n");
            }
            if(i>=(numberofline/2)+1){
                for(int j=1;j<=numberofspace;j++)
                {
                    System.out.print(" ");
                }
                numberofspace++;
                for(int j=1;j<=numberofstar;j++)
                {
                    System.out.print("*");
                }
                numberofstar -=2;
                System.out.println("\n");
            }
            
        }
        
    }
}
