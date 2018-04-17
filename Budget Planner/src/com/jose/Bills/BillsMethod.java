/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jose.Bills;

import com.jose.BudgetPlanner.BudgetPlanner;
import com.jose.BudgetPlanner.Conf;
import com.jose.BudgetPlanner.LoadData;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.jose.DB.Db;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.data.general.DefaultPieDataset;
import static com.jose.BudgetPlanner.BudgetPlanner.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author grdgy
 */
public class BillsMethod {
    
    
    public ArrayList ListDbBills() throws FileNotFoundException{
        String Indexer;
        
        Scanner csv = new Scanner(new FileInputStream("Bills.csv"));
        ArrayList<Db> list = new ArrayList<Db>();
        
        while(csv.hasNext()){
            
            Indexer = csv.next();
            String date = Indexer;
            Indexer = csv.next();
            Indexer = csv.next();
            String description = Indexer;
            Indexer = csv.next();
            Indexer = csv.next();
            int quantity = Integer.parseInt(Indexer);
            Indexer = csv.next();
            Indexer = csv.next();
            double cost = Double.parseDouble(Indexer);
            Indexer = csv.next();
            Indexer = csv.next();
            double total = Double.parseDouble(Indexer);
            
            Db u1 = new Db(quantity,cost,total,date,description);
            list.add(u1);
            
            
        }    
        
        
        
        return list;
    }
    
    public void addRowBills(JTable bills) throws FileNotFoundException {
         
         
        DefaultTableModel model = (DefaultTableModel) bills.getModel();
        
        ArrayList<Db> list = ListDbBills();
        Object rowData[] = new Object[5];
        
        
        
        for(int i = 0; i < list.size(); i++)
        {
            rowData[0] = list.get(i).date;
            rowData[1] = list.get(i).description;
            rowData[2] = list.get(i).Quantity;
            rowData[3] = list.get(i).Cost;
            rowData[4] = list.get(i).Total;
            model.addRow(rowData);
        }
             
    }
    
    public void GetBillsGraph(double mnthlybudgetIn, double billExpnses, double billLimit){
        DefaultPieDataset pieDataset = new DefaultPieDataset();
        pieDataset.setValue("Monthly Budget", new Double(mnthlybudgetIn));
        pieDataset.setValue("Bills Expenses", new Double(billExpnses));
        pieDataset.setValue("Bills Savings", new Double(billLimit - billExpnses));
        JFreeChart chart = ChartFactory.createPieChart3D("Bills",pieDataset,true,true,true);
        PiePlot3D p = (PiePlot3D)chart.getPlot();
        ChartFrame frame = new ChartFrame("Budget Planner™",chart);
        ImageIcon img = new ImageIcon("icon.png");
        frame.setIconImage(img.getImage());
        frame.setVisible(true);
        frame.setSize(300,300);
    }
    
    public void SetBillsSavings(){
        JButton submit = new JButton("Submit");
        JPanel north = new JPanel();
        JLabel allocation = new JLabel("Bills Allocation");
        JLabel limit = new JLabel("Limit: " + jTextFieldSvngs.getText());
        limit.setForeground(Color.red);
        JFrame frame = null;
        
        final JTextField
            jTextFieldBillsAlloIn = new JTextField(12);
            
        
        final JDialog dialog = new JDialog(frame, true);
        
        ImageIcon img = new ImageIcon("icon.png");
        dialog.setIconImage(img.getImage());
        submit.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {                     
              if(jTextFieldBillsAlloIn.getText().equals(""))
                {
                  JOptionPane.showMessageDialog(null,"Please Fill up all the forms","Budget Planner™",JOptionPane.ERROR_MESSAGE);
                }
              else
                 {
                     billLimit = Double.parseDouble(jTextFieldBillsAlloIn.getText());
                     new Conf().GetConfig();
                     new LoadData().loadData();                     
                     dialog.dispose();                                               
                 }    
            }
        });
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        
        gbc.gridwidth = gbc.REMAINDER;
        gbc.insets = new Insets(5,5,5,5);
        panel.add(allocation,gbc);
        panel.add(limit,gbc);
        panel.add(jTextFieldBillsAlloIn, gbc);       
        panel.add(submit,gbc);
        dialog.getContentPane().add(north, "North");
        dialog.getContentPane().add(panel);
        dialog.pack();
        dialog.setLocation(525,200);
        dialog.setSize(200,180);
        dialog.setResizable(false);
        dialog.setTitle("Budget Planner™");
        dialog.setVisible(true);
    }
    
    public void AddNewBill(){
        JButton submit = new JButton("Submit");
        JPanel north = new JPanel();      
        JLabel quantity = new JLabel("Quantity");
        JLabel desc = new JLabel("Description");
        JLabel cost = new JLabel("Cost");
        
        final JTextField
            jTextFieldUsrNmeIn = new JTextField(12),
            jTextFieldMnthlyBdgetIn = new JTextField(12);
            JTextField jTextFieldDescIn = new JTextField(12);
            JTextField jTextFieldCostIn = new JTextField(12);
            JTextField jTextFieldQuantityIn = new JTextField(12);
            
        
        final JDialog dialog = new JDialog(frame, true);
        
        ImageIcon img = new ImageIcon("icon.png");
        dialog.setIconImage(img.getImage());
        submit.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                
                 
              if(jTextFieldDescIn.getText().equals("") || jTextFieldCostIn.getText().equals("")
                       || jTextFieldQuantityIn.getText().equals(""))
                {
                  JOptionPane.showMessageDialog(null,"Please fill in all of the forms","Budget Planner™",JOptionPane.ERROR_MESSAGE);
                }
              else
                 {
                  try
                     {
                      PrintWriter Output = new PrintWriter(new BufferedWriter(new FileWriter("Bills.csv", true)));
                      
                      DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                        Date date = new Date();                                            
                      
                      double total = Integer.parseInt(jTextFieldQuantityIn.getText()) * 
                              Double.parseDouble(jTextFieldCostIn.getText());
                
                      
                      int Quantity = Integer.parseInt(jTextFieldQuantityIn.getText());
                      double cost = Double.parseDouble(jTextFieldCostIn.getText());
                      
                      String temp = dateFormat.format(date) + " ; " + jTextFieldDescIn.getText() +
                         " ; " + Quantity + " ; " + cost + " ; " + total;
                  
                      Output.println(temp);
                      Output.close();
                      new LoadData().loadData();  
                      
                      DefaultTableModel model = (DefaultTableModel) jTable1.getModel();                           
                      Object rowData[] = new Object[5];
                                              
                             rowData[0] = dateFormat.format(date);
                             rowData[1] = jTextFieldDescIn.getText();
                             rowData[2] = Quantity;
                             rowData[3] = cost;
                             rowData[4] = total;
                             model.addRow(rowData);
                                                            
                      dialog.dispose();          
                     }
                    
                     catch (IOException ex) {
                         Logger.getLogger(BudgetPlanner.class.getName()).log(Level.SEVERE, null, ex);
                     }
                     catch (NumberFormatException s){
                         JOptionPane.showMessageDialog(null, s.toString(),"Budget Planner™",JOptionPane.ERROR_MESSAGE);
                     }
                 }
             }
        });
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        
        gbc.gridwidth = gbc.REMAINDER;
        gbc.insets = new Insets(5,5,5,5);      
        panel.add(desc,gbc);       
        panel.add(jTextFieldDescIn, gbc);
        panel.add(quantity,gbc);
        panel.add(jTextFieldQuantityIn, gbc);
        panel.add(cost,gbc);       
        panel.add(jTextFieldCostIn, gbc);
        panel.add(submit,gbc);
        dialog.getContentPane().add(north, "North");
        dialog.getContentPane().add(panel);
        dialog.pack();
        dialog.setLocation(525,200);
        dialog.setSize(300,300);
        dialog.setResizable(false);
        dialog.setTitle("Budget Planner™");
        dialog.setVisible(true);
    }
}
