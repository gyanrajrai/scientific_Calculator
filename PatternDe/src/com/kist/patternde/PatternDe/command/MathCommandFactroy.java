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
public class MathCommandFactroy {
    public static MathCommand get(int param){
        if(param==1){
            return new AddCommand();
        }
         if(param==2){
            return new SubCommand();
        }
          if(param==3){
            return new MulCommand();
        }
           if(param==4){
            return new DivCommand();
        }
            if(param==5){
            return new PowerCommand();
        }
            if(param==6){
                return new ExitCommand();
            }
            return null;
    
    
}
    
}
