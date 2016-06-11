/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kist.patternde.PatternDe.command;

/**
 *
 * @author Admin
 */
public class PowerCommand extends MathCommand{

    @Override
    public double calculate(double x, double y) {
         double total=1;
         for(double i=total;i<=y;i++){
             total=total*x;
         }
        return total;
    }
    
}
