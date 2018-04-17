package com.jose.BudgetPlanner;

import static com.jose.BudgetPlanner.BudgetPlanner.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Ampatuan | Occeña | Henarios
 */
public class LoadData {   
    
public void loadData(){
        mnthlyExpnses = 0;
        mnthlySvngs = 0;
        String Indexer,Bills,Foods,Utils,Misc;
        int counter=0;
    
        try 
        {
            Scanner scanner = new Scanner(new FileInputStream("Options.conf"));
            Scanner csvBills = new Scanner(new FileInputStream("Bills.csv"));
            Scanner csvFoods = new Scanner(new FileInputStream("Foods.csv"));
            Scanner csvUtils = new Scanner(new FileInputStream("Utilities.csv"));
            Scanner csvMisc = new Scanner(new FileInputStream("Misc.csv"));
                              
            while(scanner.hasNext())
            {
                Indexer = scanner.next();
                
                if(Indexer.equals("Username:")){
                    Indexer = scanner.next();
                    jTextFieldUsrNme.setText(Indexer);
                    String Username = Indexer;
                }
                if(Indexer.equals("Monthly_Budget:")){
                    Indexer = scanner.next();
                    jTextFieldMnthlyBdget.setText("₱ "+Indexer);
                    mnthlyBdget = Double.parseDouble(Indexer);
                    mnthlybudgetIn = Double.parseDouble(Indexer);
                }
                if(Indexer.equals("Bills_Limit:")){
                    Indexer = scanner.next();
                    jTextFieldBillsAllocation.setText("₱ "+Indexer);
                    billLimit = Double.parseDouble(Indexer);
                }
                if(Indexer.equals("Foods_Limit:")){
                    Indexer = scanner.next();
                    jTextFieldFoodAllocation.setText("₱ "+Indexer);
                    foodLimit = Double.parseDouble(Indexer);
                }
                if(Indexer.equals("Utilities_Limit:")){
                    Indexer = scanner.next();
                    jTextFieldUtilAllocation.setText("₱ "+Indexer);
                    utilLimit = Double.parseDouble(Indexer);
                }
                if(Indexer.equals("Misc_Limit:")){
                    Indexer = scanner.next();
                    jTextFieldMiscAllocation.setText("₱ "+Indexer);
                    miscLimit = Double.parseDouble(Indexer);
                }
            }
            billExpnses=0;
            while(csvBills.hasNext())
                        {
                            Bills= csvBills.next();
                         if(Bills.equals(";")){
                             counter++;
                             if(counter == 4){
                                 counter = 0;
                                 Bills=csvBills.next();
                                 double temp = Double.parseDouble(Bills);
                                 billExpnses = billExpnses + temp;
                             }
                             
                         }       
                        }
            foodExpnses=0;
            while(csvFoods.hasNext())
                        {
                            Foods= csvFoods.next();
                         if(Foods.equals(";")){
                             counter++;
                             if(counter == 4){
                                 counter = 0;
                                 Foods=csvFoods.next();
                                 double temp = Double.parseDouble(Foods);
                                 foodExpnses = foodExpnses + temp;
                             }
                             
                         }       
                        }
            
            utilExpnses=0;
            while(csvUtils.hasNext())
                        {
                            Utils= csvUtils.next();
                         if(Utils.equals(";")){
                             counter++;
                             if(counter == 4){
                                 counter = 0;
                                 Utils=csvUtils.next();
                                 double temp = Double.parseDouble(Utils);
                                 utilExpnses = utilExpnses + temp;
                             }
                             
                         }       
                        }
            miscExpnses=0;
            while(csvMisc.hasNext())
                        {
                            Misc= csvMisc.next();
                         if(Misc.equals(";")){
                             counter++;
                             if(counter == 4){
                                 counter = 0;
                                 Misc=csvMisc.next();
                                 double temp = Double.parseDouble(Misc);
                                 miscExpnses = miscExpnses + temp;
                             }
                             
                         }       
                        }
            
            mnthlyExpnses = mnthlyExpnses  + billLimit + foodLimit + utilLimit + miscLimit;
            mnthlySvngs = mnthlyBdget - mnthlyExpnses;
            
            double billsLeft=0;
            jTextFieldAllocationLeft.setText("₱ " + (billsLeft = billLimit - billExpnses));
            jTextFieldBillsExpnses.setText("₱ " + billExpnses);
            
            double foodsLeft=0;
            jTextFieldFoodAllocationLeft.setText("₱ " + (foodsLeft = foodLimit - foodExpnses));
            jTextFieldFoodsExpnses.setText("₱ " + foodExpnses);
            
            double utilsLeft=0;
            jTextFieldUtilsAllocationLeft.setText("₱ " + (utilsLeft = utilLimit - utilExpnses));
            jTextFieldUtilsExpnses.setText("₱ " + utilExpnses);
            
            double miscLeft=0;
            jTextFieldMiscAllocationLeft.setText("₱ " + (miscLeft = miscLimit - miscExpnses));
            jTextFieldMiscExpnses.setText("₱ " + miscExpnses);
            
            
            jTextFieldMnthlyExpnses.setText("₱ " + mnthlyExpnses);
            jTextFieldSvngs.setText("₱ " + mnthlySvngs);
            
                                                     
        }
        
        catch (FileNotFoundException ex){
            Logger.getLogger(BudgetPlanner.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (NumberFormatException s){
                         JOptionPane.showMessageDialog(null, s.toString(),"Budget Planner™",JOptionPane.ERROR_MESSAGE);
        }
        
    }
}
