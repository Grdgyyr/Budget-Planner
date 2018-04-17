package com.jose.BudgetPlanner;


import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import static com.jose.BudgetPlanner.BudgetPlanner.*;

/**
 *
 * @author Ampatuan | Occeña | Henarios
 */
public class Conf {
    public void GetConfig(){      
        
        String temp = "Username: " + Username + "\n"
              + "Monthly_Budget: " + mnthlybudgetIn + "\n"
              + "Bills_Limit: " + billLimit + "\n"
              + "Foods_Limit: " + foodLimit + "\n"
              + "Utilities_Limit: " + utilLimit + "\n"
              + "Misc_Limit: " + miscLimit  ;
        
        
        try{
            PrintWriter Output = new PrintWriter("Options.conf");
            
            Output.println(temp);     
            Output.close();
            //loadData();
                                
            }
        catch (FileNotFoundException ex){
                     Logger.getLogger(BudgetPlanner.class.getName()).log(Level.SEVERE, null, ex);
            }
        
    }
}
