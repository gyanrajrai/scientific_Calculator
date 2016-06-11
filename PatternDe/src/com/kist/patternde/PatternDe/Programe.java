/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kist.patternde.PatternDe;

import com.kist.patternde.PatternDe.calculator.Calculator;
import com.kist.patternde.PatternDe.command.AddCommand;
import com.kist.patternde.PatternDe.command.MathCommand;
import com.kist.patternde.PatternDe.command.MathCommandFactroy;
import com.kist.patternde.PatternDe.command.MulCommand;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Programe {
    private static Object input;

    public static void main(String[] args) {
      
        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter First Number");

            double x = scan.nextDouble();
            System.out.println("Enter Second Numbber");
            double y = scan.nextDouble();
            double total = 0;

            System.out.println("1.Add");
            System.out.println("2.Sub");
            System.out.println("3.Mul");
            System.out.println("4.Sub");
            System.out.println("5.Power");
            System.out.println("6.Exit");
            System.out.println("Enter your Choice [1-6]");
                    
                   
            MathCommand cmd=MathCommandFactroy.get(scan.nextInt());
            if(cmd!=null){
                System.out.println("Total is:"+cmd.calculate(x, y));
                
                        
            }
            System.out.println("Invalid Command");
         
            
            System.out.println("do you want to continue[Y/N]");
            if(scan.next().equalsIgnoreCase("N"))
            System.exit(0);
            
        }
    }
}

